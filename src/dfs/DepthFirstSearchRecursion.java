package dfs;

import java.util.List;

/*
Can be implemented with help of stack abstract data type

recursive solution:
dfs(vertex):
   set vertex visited
   for v in vertex neighbors
       if v is not visited
            dfs(v)
* */
public class DepthFirstSearchRecursion {
    public void dfs(List<Vertex> vertexList){

        // scenario if we have independent clusters
        for(Vertex v : vertexList){
            if(!v.isVisited()){
                v.setVisited(true);
                dfsHelper(v);
            }
        }
    }

    private void dfsHelper(Vertex vertex){
        System.out.println(vertex);

        for(Vertex v : vertex.getNeighbors()){
            if(!v.isVisited()){
                v.setVisited(true);
                dfsHelper(v);
            }
        }
    }
}
