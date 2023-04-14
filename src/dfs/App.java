package dfs;

import java.util.ArrayList;
import java.util.List;

/*
Depth-First Search
It explores as far as possible along each branch before backtracking and visiting other vertexes
- it was investigated as a strategy for solving mazes by Temaux back in 19th century.
- running complexity is O(V+E).
- memory complexity is way better than that of breadth-first search.
- it has O(logN) memory complexity in worst-case scenario. Height of the tree.
- Preferred usually when graph traversal is needed.
- it finds outlier items faster(when vertex is far away from the starting node).

Applications:
1. Pathfinding Algorithms
    AI approaches help robots discover the surrounding easily with BFS and DFS
2. Topological ordering
    We can use dfs to find the topological ordering that has several applications(build tools,
    SCC, etc)
3. Strongly connected components
    DFS can find the strongly connected components of G(V,E) graph that has several applications
    (Youtube, etc)
4. Cycle Detection
   DFS can detect cycles in G(V,E) directed graphs that is absolutely crucial in operating systems.
* */
public class App {
    public static void main(String[] args){

        Vertex v1 = new Vertex("A");
        Vertex v2 = new Vertex("B");
        Vertex v3 = new Vertex("C");
        Vertex v4 = new Vertex("D");
        Vertex v5 = new Vertex("E");
        Vertex v6 = new Vertex("F");
        Vertex v7 = new Vertex("G");
        Vertex v8 = new Vertex("H");

        List<Vertex> list = new ArrayList<>();
        v1.addNeighbor(v2);
        v1.addNeighbor(v6);
        v1.addNeighbor(v7);
        v2.addNeighbor(v3);
        v2.addNeighbor(v4);
        v4.addNeighbor(v5);
        v7.addNeighbor(v8);

        list.add(v1);
        list.add(v2);
        list.add(v3);
        list.add(v4);
        list.add(v5);
        list.add(v6);
        list.add(v7);
        list.add(v8);

        DepthFirstSearchStack dfs = new DepthFirstSearchStack();
        dfs.dfs(list);

//        DepthFirstSearchRecursion dfs = new DepthFirstSearchRecursion();
//        dfs.dfs(list);

    }
}
