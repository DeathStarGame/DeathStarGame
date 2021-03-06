## we need to think/create/build the project features - events,scenarios

- the thinking/building torunaments and events should be unlocked
- we can either design graphically/express in words all waht system does - purely in docs
- but this is not enjoybale to create sceanrios this way, it's should be done programmatically
- we want to build the project for web 3.0 - decentralizaed, distributed, with peers joining/leaving
- what is needed: design and build system in layers, so we can build it and use it, regardless of whether or not tools are ready
- so ui layer, requests, queries, identity, multiplayer ... - all that should be built and usabe, whether or not distributed and decentralized out of the gate
- however
    - we cannot take a random db and than substitute it for web 3.0 (IPFS)
    - unless the db supports this kind of storage swapping
    - the data layer of the system - querying and data schema and transport and encoding - these are the system, they cannot be "substituted later"
    - we can swap storage layer (like datomic does, dgraph or any other db - swap the store), but we cannot swap our data design
- it super simple: we need to build all layers of the system, as they should be with data abstarcation (database simply) in place, and be sure it will work with IPFS and peers
    - there is ipfs-cluster and orbitdb, what else ? ... 
- sockets vs peers
    - peers, we need to start thinking in terms of peers
    - socket will be only used to connect from web ui to locally running IPFS peer node
    - it's a new way of thinknig: we don't connect socket to the hub, we are peers and the system thinks in terms of peers
- with that, how would we develop locally? well, peers seems to be perfect for that, if we run them in docker
    - because every such peer in docker container will have a separate port, like localhost:3001, so we can open a tab per player and auth (identity) would not conflict

<img  height="512px" src="./svg/2020-10-14-ipfs-peers-in-docker.svg"></img>

- bottom line: we need to either draw/describe the whole system without code, or build it properly, with idenetity and multiplayer, but via layers
- tournamets, events, scenarios, user and player experience - those should be a daily focus, not tools/lack of abstactions/tools

## system is simple: IPFS peers and decentralized distirbuted graph db  

- peers already solved by IPFS
- db
    - should be decentralized and distributed, with peers opting into how much they will store
    - should be queried as a graph (e.g. graphql), with decentralized queries
        - db maintains which peers have what (just like IPFS or using IPFS)
        - when we query on a peer, that query hops around and results are returned and aggregated and we get the result in our app
        - so programmatically, we abstractly ask "cluster of peers, what are the events?" and wait for queiry to resolve
    - we should be able to subscribe to certain queires like "current events" or "list of players in this tournament"
        - every time a trasaction to db happens, all peers get data and update their local db and push data to gui to render
- joining/leaving events/games
    - all done via db and publishing updates to peers
    - transaction -> send data to relevant peers (all or subgroup)
- playing a game
    - same - done via db
    - say, 8 players play a team game within a tournament
    - in an efficient manner (every 5-10sec for example), players actions/state are transacted into db and other 7 peers get's a query update (because each peer subscribed for a query)
    - running the simulation cycle happens the same: player's state (code) is submitted, db changes, peers get data and *every* peer runs a simulation as a sideeffect for gui
    - one of the peers simultaion result is transacted to db as the new game state, all peers get the query update
- identity
    - vid DID (decentralized identity)