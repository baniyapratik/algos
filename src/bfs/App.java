package bfs;

/*
Breadth-First Search
It visits the neighbors and then the neighbors of these new vertices until all the nodes are
visited.
- Run time complexity is O(V+E)
- Main problem with BFS is that it has to store a lot of references so the memory complexity is
not favorable.

Applications

1. Garbage collection:
    Cheyen's algorithm uses BFS during the garbage collection to maintain the active referencs on
     the heap memory
2. Maximum flow:
    We can find the maximum flow in a flow network with Edmonds-karp algorithm that uses BFS for
    finding augmenting paths
3. Pathfinding algorithms:
    AI approaches help robots discover the surrounding easily with BFS and DFS
4. Serialization:
    Serialization and deserialization of tree like structures(when ordering does matter) it
    enables the tree to be reconstructed in an efficient manner
* */
public class App {
    public static void main(String[] args){
        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();

        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");
        Vertex g = new Vertex("G");
        Vertex h = new Vertex("H");

        a.addNeighbor(b);
        a.addNeighbor(f);
        a.addNeighbor(g);

        b.addNeighbor(a);
        b.addNeighbor(c);
        b.addNeighbor(d);

        c.addNeighbor(b);

        d.addNeighbor(b);
        d.addNeighbor(e);

        e.addNeighbor(d);

        f.addNeighbor(a);

        g.addNeighbor(a);
        g.addNeighbor(h);

        h.addNeighbor(g);

        breadthFirstSearch.traverse(a);

        /* Expected output
            Actual visited vertex: A
            Actual visited vertex: B
            Actual visited vertex: F
            Actual visited vertex: G
            Actual visited vertex: C
            Actual visited vertex: D
            Actual visited vertex: H
            Actual visited vertex: E
        * */
    }
}
