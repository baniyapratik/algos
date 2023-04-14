package bfs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String name;
    private boolean visited;
    private List<Vertex> adjacencyList;

    public Vertex(String name){
        this.name = name;
        this.adjacencyList = new ArrayList<>();
    }

    @Override
    public String toString(){
        return this.name;
    }


    boolean isVisited() {
        return visited;
    }

    void setVisited(final boolean visited) {
        this.visited = visited;
    }

    List<Vertex> getAdjacencyList() {
        return adjacencyList;
    }

    void addNeighbor(Vertex vertex) {
        this.adjacencyList.add(vertex);
    }
}
