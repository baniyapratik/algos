package dfs;

import java.util.List;
import java.util.Stack;

/*
Impl using stack
* */

public class DepthFirstSearchStack {

    private Stack<Vertex> stack;

    public DepthFirstSearchStack(){
        this.stack = new Stack<>();
    }
    public void dfs(List<Vertex> vertexList){
        // it may happen that we have independent clusters
        for(Vertex v: vertexList){
            if(!v.isVisited()){
                v.setVisited(true);
                dfsHelper(v);
            }
        }
    }

    private void dfsHelper(Vertex rootVertex){
        // last in first out
        stack.add(rootVertex);
        rootVertex.setVisited(true);

        while(!stack.isEmpty()){
            Vertex actualVertex = stack.pop();
            System.out.println(actualVertex);

            // consider all the neighbors
            for(Vertex v: actualVertex.getNeighbors()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    stack.add(v);
                }
            }
        }
    }
}
