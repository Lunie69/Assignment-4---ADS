# Assignment-4---ADS <br>
This assignment show me that We have no apportunity to escape form math, exactly from DISCRETE MATHEMATICS AUUUGHHHHH, poor SE-2512 with flashbacks.... <br>
1. Vertex <img width="1920" height="1017" alt="{6C123429-E383-431D-B3BC-D686F81EC9B9}" src="https://github.com/user-attachments/assets/8bfc1abd-0b7c-49fd-8369-6079f3e6e2b7" /> <br>
Represents a graph node. <br>
<br>
2. Edge <img width="1920" height="1020" alt="{38CF8D9F-E340-45E8-BBD3-1A6A31F0D51D}" src="https://github.com/user-attachments/assets/cfd189c0-d819-477b-b404-fea507ff5073" /> <br>
Represents a connection between two vertices. <br>
<br>
3. Graph <img width="1920" height="1016" alt="{6DF468AB-C12E-4C5B-8490-05541214FAB6}" src="https://github.com/user-attachments/assets/bed5916b-e3d6-4a59-a326-f6766eed2b2e" /> <br>
Graph shows us that vetexes are connected with edges, it stores them. <br>
To check the working ability of my code I've wrote main <br>
<img width="1920" height="1017" alt="{2D46EDF2-223F-4305-BEE6-AD500D88BE00}" src="https://github.com/user-attachments/assets/22c5d17f-5b84-45bb-bf76-04159e48ed82" /> <br>
<br>
4. BSF <br>
BFS visits vertices level by level.<br>
<br>
Steps:<br>
1. Start from a selected vertex<br>
2. Add it to a queue<br>
3. Visit neighboring vertices<br>
4. Continue until all reachable vertices are visited<br>
<img width="1920" height="1015" alt="{E5436F53-318B-4492-8375-6E27D90D046E}" src="https://github.com/user-attachments/assets/09c74f0d-c192-43cb-af6f-975bba7b4b9e" /> <br>
<br>
6. DFS <br>
DFS explores one path deeply before backtracking. <br>
<br>
Steps: <br>
1. Start from a selected vertex <br>
2. Visit a neighbor <br>
3. Continue deeper recursively <br>
4. Backtrack when needed <br>
<br>
  <img width="1920" height="1020" alt="{05DDB295-87F1-4789-A76A-16F974BB3E7F}" src="https://github.com/user-attachments/assets/2d6e595d-6832-4415-a361-584c15f69242" /> <br>
For DFS I've integrated new method - dfsHelper <br>
<img width="868" height="433" alt="{26BAE04F-5453-4093-A700-E314E86DAFC6}" src="https://github.com/user-attachments/assets/ea4344f3-5772-49be-a1ad-2895f0f5e6b0" />
<br>
9. Experiment <img width="1920" height="1020" alt="{56B00460-C615-4063-8585-3B7E8ADE5D55}" src="https://github.com/user-attachments/assets/fbc5deef-5f4f-48ec-9eb7-f22160293d6f" /> <br>
<img width="1168" height="584" alt="{BB8C7430-E8FC-4989-A645-F83EC6FD590B}" src="https://github.com/user-attachments/assets/99cdab5f-1ec1-469f-918d-061ba8308cbb" /> <br>
<img width="1035" height="626" alt="{33B31BD4-288E-42B9-8E82-7A60C33BD609}" src="https://github.com/user-attachments/assets/701f0146-bc01-44da-ab60-e4afa8edbdbe" /> <br>
Responsible for: <br>
- Running BFS and DFS <br>
- Measuring execution time <br>
- Testing graphs of different sizes <br>
- Printing performance reports <br>
<br>
7. I've updated my methods in Graph and EXPERIMENT classes for much more clearer code <br>
 <img width="1920" height="1020" alt="{2F073A2C-5557-4310-82D8-457FE2E29F0F}" src="https://github.com/user-attachments/assets/afe64bc3-e99f-47eb-beac-514a478df7d3" /><br>
<br>
<br>
 ## How does graph size affect BFS and DFS performance?
 <br>

As the graph size increases, traversal time also increases because more vertices and edges must be processed.
<br>

## Which traversal was faster?
<br>

In my experiments, both algorithms showed similar performance, although DFS was sometimes slightly faster because of recursive traversal.
<br>


## Do the results match O(V + E)?
<br>

Yes. Both BFS and DFS scale according to the expected time complexity because every vertex and edge is visited once.

<br>

## How does graph structure affect traversal order?
<br>

Traversal order depends on how vertices are connected in the adjacency list. Different edge structures produce different BFS and DFS paths.

<br>
## When is BFS preferred over DFS?
<br>
BFS is preferred when the shortest path is needed in an unweighted graph.
<br>

## What are the limitations of DFS?<br>
<br>
DFS may consume more memory because of recursion depth and does not always produce the shortest path.
