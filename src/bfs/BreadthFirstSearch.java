package bfs;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    public void traverse(Vertex root) {

        // empty queue
        Queue<Vertex> queue = new LinkedList<>();

        // set the root as visited and add it to the queue
        root.setVisited(true);
        queue.add(root);

        // iterate while the queue is not empty
        while (!queue.isEmpty()) {
            Vertex actualVertex = queue.remove();
            System.out.println("Actual visited vertex: " + actualVertex);
            for(Vertex v: actualVertex.getAdjacencyList()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    queue.add(v);
                }
            }
        }
    }
}
