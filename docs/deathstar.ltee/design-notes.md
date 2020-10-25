
This document is a linear continuation of:

- [../cloud-native-system/design.md](../cloud-native-system/design.md)
- [../search-for-the-game.md](../search-for-the-game.md)
- [../origin-cluster/origin-cluster.md](../origin-cluster/origin-cluster.md)
- [./as-vscode-extension.md](./as-vscode-extension.md)

## switch account feature like in youtube

- to be able to open multiple tabs and easily select identity


## explore the idea of building without sockets for simplicity

- submit user code and get updates via http requests
- if that is limiting, definitely go for socket or sse

## thinking how to use graphql, async ops with status, app logic

<!-- <img height="512px" src="./svg/2020-10-16-graphql.svg"></img> -->
<div>
<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<svg
   xmlns:dc="http://purl.org/dc/elements/1.1/"
   xmlns:cc="http://creativecommons.org/ns#"
   xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
   xmlns:svg="http://www.w3.org/2000/svg"
   xmlns="http://www.w3.org/2000/svg"
   xmlns:sodipodi="http://sodipodi.sourceforge.net/DTD/sodipodi-0.dtd"
   xmlns:inkscape="http://www.inkscape.org/namespaces/inkscape"
   width="297mm"
   height="144mm"
   viewBox="0 0 297 144"
   version="1.1"
   id="svg8"
   sodipodi:docname="2020-10-16-graphql.svg"
   inkscape:version="1.0.1 (3bc2e813f5, 2020-09-07)">
  <defs
     id="defs2">
    <rect
       x="154.46326"
       y="81.494331"
       width="71.05986"
       height="45.127491"
       id="rect1096" />
    <rect
       x="49.04417"
       y="82.763191"
       width="81.197357"
       height="63.798897"
       id="rect1090" />
    <rect
       x="20.622807"
       y="79.218307"
       width="50.945824"
       height="16.812269"
       id="rect973" />
    <rect
       x="67.141853"
       y="102.27211"
       width="86.288086"
       height="14.411219"
       id="rect917" />
    <rect
       x="67.141853"
       y="102.27211"
       width="86.288086"
       height="14.411219"
       id="rect917-3" />
    <rect
       x="67.141853"
       y="102.27211"
       width="86.288086"
       height="14.411219"
       id="rect934" />
    <rect
       x="20.622807"
       y="79.218307"
       width="50.945824"
       height="16.812269"
       id="rect973-9" />
    <rect
       x="20.622807"
       y="79.218307"
       width="50.945824"
       height="16.812269"
       id="rect986" />
    <rect
       x="20.622807"
       y="79.218307"
       width="50.945824"
       height="16.812269"
       id="rect973-9-2" />
    <rect
       x="20.622807"
       y="79.218307"
       width="50.945824"
       height="16.812269"
       id="rect1028" />
    <rect
       x="20.622807"
       y="79.218307"
       width="50.945824"
       height="16.812269"
       id="rect973-9-9" />
    <rect
       x="20.622807"
       y="79.218307"
       width="50.945824"
       height="16.812269"
       id="rect1028-3" />
  </defs>
  <sodipodi:namedview
     id="base"
     pagecolor="#ffffff"
     bordercolor="#666666"
     borderopacity="1.0"
     inkscape:pageopacity="0.0"
     inkscape:pageshadow="2"
     inkscape:zoom="0.98994949"
     inkscape:cx="436.13714"
     inkscape:cy="382.2649"
     inkscape:document-units="mm"
     inkscape:current-layer="layer1"
     inkscape:document-rotation="0"
     showgrid="false"
     inkscape:snap-global="false"
     inkscape:window-width="1868"
     inkscape:window-height="1025"
     inkscape:window-x="0"
     inkscape:window-y="27"
     inkscape:window-maximized="1" />
  <metadata
     id="metadata5">
    <rdf:RDF>
      <cc:Work
         rdf:about="">
        <dc:format>image/svg+xml</dc:format>
        <dc:type
           rdf:resource="http://purl.org/dc/dcmitype/StillImage" />
        <dc:title></dc:title>
      </cc:Work>
    </rdf:RDF>
  </metadata>
  <g
     inkscape:label="Layer 1"
     inkscape:groupmode="layer"
     id="layer1">
    <rect
       style="fill:none;stroke:#000000;stroke-width:0.564999"
       id="rect839"
       width="57.060226"
       height="37.344112"
       x="9.7109137"
       y="27.194963" />
    <rect
       style="fill:none;stroke:#000000;stroke-width:0.564999"
       id="rect841"
       width="22.85029"
       height="25.823139"
       x="38.292198"
       y="33.027225" />
    <rect
       style="fill:none;stroke:#000000;stroke-width:0.564999"
       id="rect841-3"
       width="22.85029"
       height="25.823139"
       x="12.967746"
       y="33.822956" />
    <path
       style="fill:none;stroke:#000000;stroke-width:0.264583px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="m 68.89022,44.964852 11.081182,-0.02835 -2.88373,-3.166626"
       id="path864" />
    <path
       style="fill:none;stroke:#000000;stroke-width:0.264583px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="m 79.588949,44.895849 -2.247995,1.213337"
       id="path866" />
    <path
       style="fill:none;stroke:#000000;stroke-width:0.264583px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="m 89.480603,17.718014 0.184513,62.435164"
       id="path868" />
    <ellipse
       style="fill:none;stroke:#000000;stroke-width:0.564999"
       id="path870"
       cx="107.44389"
       cy="30.664761"
       rx="11.239231"
       ry="7.5885572" />
    <path
       style="fill:none;stroke:#000000;stroke-width:0.264583px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="M 82.508689,56.526808 69.010344,56.716996 73.02595,53.874838"
       id="path876" />
    <path
       style="fill:none;stroke:#000000;stroke-width:0.264583px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="m 70.989713,56.876777 2.606985,2.385351"
       id="path878" />
    <path
       style="fill:none;stroke:#000000;stroke-width:0.264583px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="m 142.50145,16.95581 0.52216,63.031334"
       id="path880" />
    <ellipse
       style="fill:none;stroke:#000000;stroke-width:0.564999"
       id="path882"
       cx="152.39474"
       cy="41.88982"
       rx="6.4041286"
       ry="2.5093119" />
    <ellipse
       style="fill:none;stroke:#000000;stroke-width:0.564999"
       id="path882-6"
       cx="153.28171"
       cy="47.74548"
       rx="6.4041286"
       ry="2.5093119" />
    <ellipse
       style="fill:none;stroke:#000000;stroke-width:0.564999"
       id="path882-7"
       cx="153.99667"
       cy="53.7136"
       rx="6.4041286"
       ry="2.5093119" />
    <path
       style="fill:none;stroke:#000000;stroke-width:0.264583px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="m 145.34933,41.481439 2.11188,13.587675"
       id="path911" />
    <path
       style="fill:none;stroke:#000000;stroke-width:0.264583px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="m 159.32621,41.353148 1.11836,13.844693"
       id="path913" />
    <text
       xml:space="preserve"
       id="text915"
       style="font-style:normal;font-weight:normal;font-size:4.93889px;line-height:1.25;font-family:sans-serif;white-space:pre;shape-inside:url(#rect917);fill:#000000;fill-opacity:1;stroke:none;"
       transform="rotate(-90,53.005461,71.564059)"><tspan
         x="67.142578"
         y="106.64124"><tspan
           style="shape-inside:url(#rect917)">graphql</tspan></tspan></text>
    <text
       xml:space="preserve"
       id="text915-5"
       style="font-style:normal;font-weight:normal;font-size:4.93889px;line-height:1.25;font-family:sans-serif;white-space:pre;shape-inside:url(#rect917-3);fill:#000000;fill-opacity:1;stroke:none;"
       transform="rotate(-90,78.998328,45.964121)"><tspan
         x="67.142578"
         y="106.64124"><tspan
           style="shape-inside:url(#rect917-3)">graphql db </tspan></tspan></text>
    <text
       xml:space="preserve"
       id="text971"
       style="font-style:normal;font-weight:normal;font-size:4.93889px;line-height:1.25;font-family:sans-serif;white-space:pre;shape-inside:url(#rect973);fill:#000000;fill-opacity:1;stroke:none;"
       transform="translate(-6.1859343,-63.240361)"><tspan
         x="20.623047"
         y="83.58851"><tspan
           style="shape-inside:url(#rect973)">web gui</tspan></tspan></text>
    <text
       xml:space="preserve"
       id="text971-1"
       style="font-style:normal;font-weight:normal;font-size:4.93889px;line-height:1.25;font-family:sans-serif;white-space:pre;shape-inside:url(#rect973-9);fill:#000000;fill-opacity:1;stroke:none;"
       transform="translate(80.88729,-53.623462)"><tspan
         x="20.623047"
         y="83.58851"><tspan>app</tspan></tspan></text>
    <ellipse
       style="fill:none;stroke:#000000;stroke-width:0.564999"
       id="path870-7"
       cx="107.84216"
       cy="48.040855"
       rx="11.239231"
       ry="7.5885572" />
    <text
       xml:space="preserve"
       id="text971-1-0"
       style="font-style:normal;font-weight:normal;font-size:4.93889px;line-height:1.25;font-family:sans-serif;white-space:pre;shape-inside:url(#rect973-9-2);fill:#000000;fill-opacity:1;stroke:none;"
       transform="translate(81.285557,-36.247365)"><tspan
         x="20.623047"
         y="83.58851"><tspan>app</tspan></tspan></text>
    <ellipse
       style="fill:none;stroke:#000000;stroke-width:0.564999"
       id="path870-6"
       cx="107.69133"
       cy="67.676353"
       rx="11.239231"
       ry="7.5885572" />
    <text
       xml:space="preserve"
       id="text971-1-06"
       style="font-style:normal;font-weight:normal;font-size:4.93889px;line-height:1.25;font-family:sans-serif;white-space:pre;shape-inside:url(#rect973-9-9);fill:#000000;fill-opacity:1;stroke:none;"
       transform="translate(81.134726,-16.611867)"><tspan
         x="20.623047"
         y="83.58851"><tspan>app</tspan></tspan></text>
    <path
       style="fill:none;stroke:#000000;stroke-width:0.264583px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="m 124.52555,43.516377 h 5.80202"
       id="path1070" />
    <path
       style="fill:none;stroke:#000000;stroke-width:0.264583px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="m 125.23799,51.97671 5.52818,-0.371277"
       id="path1072" />
    <path
       style="fill:none;stroke:#000000;stroke-width:0.264583px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="m 128.61872,41.972946 0.75595,1.389775"
       id="path1074" />
    <path
       style="fill:none;stroke:#000000;stroke-width:0.264583px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="M 128.60271,44.843223 130.2556,43.73459"
       id="path1076" />
    <path
       style="fill:none;stroke:#000000;stroke-width:0.264583px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="m 125.98709,50.264779 -0.89449,1.240888"
       id="path1078" />
    <path
       style="fill:none;stroke:#000000;stroke-width:0.264583px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="m 125.34017,52.24658 1.04026,1.360127"
       id="path1080" />
    <text
       xml:space="preserve"
       id="text1088"
       style="font-style:normal;font-weight:normal;font-size:3.52778px;line-height:1.25;font-family:sans-serif;white-space:pre;shape-inside:url(#rect1090);fill:#000000;fill-opacity:1;stroke:none;"
       transform="translate(133.8665,-53.537174)"><tspan
         x="49.044922"
         y="85.88493"><tspan
           style="font-size:3.52778px">- apps expose operations as single graphql </tspan></tspan><tspan
         x="49.044922"
         y="90.294659"><tspan
           style="font-size:3.52778px">endpoint
</tspan></tspan><tspan
         x="49.044922"
         y="94.704388"><tspan
           style="font-size:3.52778px">- query/transaction request happens, gui </tspan></tspan><tspan
         x="49.044922"
         y="99.114117"><tspan
           style="font-size:3.52778px">tools already support loading state (and </tspan></tspan><tspan
         x="49.044922"
         y="103.52385"><tspan
           style="font-size:3.52778px">possibly other operation states)
</tspan></tspan><tspan
         x="49.044922"
         y="107.93358"><tspan
           style="font-size:3.52778px">- apps perform any ops/logic as needed, </tspan></tspan><tspan
         x="49.044922"
         y="112.3433"><tspan
           style="font-size:3.52778px">asynchronously - and make db transactions, </tspan></tspan><tspan
         x="49.044922"
         y="116.75303"><tspan
           style="font-size:3.52778px">as usual
</tspan></tspan><tspan
         x="49.044922"
         y="121.16276"><tspan
           style="font-size:3.52778px">- apps are processes
</tspan></tspan><tspan
         x="49.044922"
         y="125.57249"><tspan
           style="font-size:3.52778px">- ???!!! missing: there should be a queue to </tspan></tspan><tspan
         x="49.044922"
         y="129.98222"><tspan
           style="font-size:3.52778px">take ops in, report op status changes </tspan></tspan><tspan
         x="49.044922"
         y="134.39195"><tspan
           style="font-size:3.52778px">(loading, in porgress, failed) and reqturning </tspan></tspan><tspan
         x="49.044922"
         y="138.80168"><tspan
           style="font-size:3.52778px">results in the end</tspan></tspan></text>
    <text
       xml:space="preserve"
       id="text1094"
       style="font-style:normal;font-weight:normal;font-size:5.64444px;line-height:1.25;font-family:sans-serif;white-space:pre;shape-inside:url(#rect1096);fill:#000000;fill-opacity:1;stroke:none;"
       transform="translate(-104.66505,23.691574)"><tspan
         x="154.46289"
         y="86.488147"><tspan
           style="shape-inside:url(#rect1096)">???
</tspan></tspan><tspan
         x="154.46289"
         y="93.543697"><tspan
           style="shape-inside:url(#rect1096)">queue is missing </tspan></tspan></text>
    <path
       style="fill:none;stroke:#000000;stroke-width:0.264583px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="m 73.033405,93.459606 -1.334651,9.319084"
       id="path1100" />
    <path
       style="fill:none;stroke:#000000;stroke-width:0.264583px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       d="m 69.969575,95.190952 3.208687,-2.861273 2.666318,4.312676"
       id="path1102" />
  </g>
</svg>
</div>

## explore existing self-hostable systems with sane design, re-purpose for the game

- consider systems out there that have all the intangibles - graph data layer, identity, ops, logic in a decoupled apps,reverse-proxy, simplicity...
- fork, replace apps and logic with game app(s) and processes, replace gui etc.

## app should be an extension of the system

- system should be runnable on it's own, with identity, reverse proxy, database
- apps and their ui should (even dynamically) come into the system and access data layer etc.
- apps and ui are logic, while identity, netwroking, data layer are part of the system


## apps are esentailly processes (intances), so they never talk via http, only via queue/peer abstactions

- if app needs to perform operation on another app, it does so by abstract request/push to *central* thingy: "hey, system, so this", not to each other

## identity: provider auth contradicts the design of deathstar.ltee, so identity is always self

- providers require to register apps, which would make the system not actually self-hosted

## indentity: possible to implement auth using DID (decentralized identifiers) as they seem to be the next gen and global

- is ti correct to assume,that with DID a user can login into different servers (with fresh dbs) and still maintain identity? because it's a private key file?
- can(are there tools/info) a browser UI use DIDs to auth into the system?
- where will users store DID? on some IPFS provider? "login with IPFS" ? or in browser storage ? on disk?
- is it possible: no tokens, no sessions, no passwords stored and crap - every request/message has a DID as identifier?  

## multiple apps, multiple uis, gateway and queue, apps talk via gateway

- identity ui (seprate, redirects)
- multiplayer ui (separate app behind it)
- graphiql ui (to do arbitrary queries agains data/history)
- history/stats/wiki type thingy ui (as a separate app)

## IPFS/libp2p is for users/peers netwroking, while browser and docker apps still need a single bidirectional async/sync protocol to talk within a system

- even in web3.0 decentralized global app, a user (peer) will run an instance of a system - a docker deployment
- system instance on a user machine is always comprised of apps (services/containers)
- a user will open localhost:port to access game ui, which will talk to the instance (system) running on the same machine
- and that instance - apps, db, gui serving containers .. - will talk to IPFS peer node and through it reach other peers and form a global cluster/mesh of the game
- and that's where libp2p plays its role, to exchange data between peers
- but: the inter-process (microservice) communication on a singel manchine, between containers and browser ui - it requires a protocol approach different from libp2p
- it's a generic question of comprising a system of processes (microservices), and it should be a generic bidirectional protocol, agnostic(same) to apps and browser
- in simple words: browser ui apps and docker apps (db, queues, apps,gateway, uis) should all talk async/sync bidirectional protocol (e.g. RSocket) 

## imagining stuff: rsocket and netifi+traefik-like router 

<img height="648px" src="./svg/2020-10-22-rsocket.svg"></img>


