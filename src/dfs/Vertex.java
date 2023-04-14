package dfs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name;
    private boolean visited;
    private List<Vertex> adjacentList;

    public Vertex(String name){
        this.name = name;
        this.adjacentList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return name;
    }

    public void addNeighbor(Vertex v) {
        this.adjacentList.add(v);
    }

    public List<Vertex> getNeighbors(){
        return this.adjacentList;
    }

    boolean isVisited() {
        return visited;
    }

    void setVisited(final boolean visited) {
        this.visited = visited;
    }
}
