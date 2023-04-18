package maze;

public class MazeSolver {

    private int startRow;
    private int startCol;
    private int[][] maze;
    private boolean[][] visited;

    public MazeSolver(int[][] maze, int startRow, int startCol){
        this.maze = maze;
        this.visited = new boolean[maze.length][maze.length];
        this.startRow = startRow;
        this.startCol = startCol;
    }

    public void findWay(){
        if(dfs(startRow, startCol)){
            System.out.println("Solution exists.");
        } else {
            System.out.println("No solution exists.");
        }

    }

    public boolean isFeasible(int x, int y){
        // check vertical dimension
        if (x < 0 || x > maze.length-1) {
            return false;
        }
        // check horizontal dimension
        if (y < 0 || y > maze.length-1) {
            return false;
        }
        // already visited
        if (visited[x][y]){
            return false;
        }
        // obstacle on the way
        if(maze[x][y] == 1) {
            return false;
        }
        return true;
    }

    public boolean dfs(int x, int y){
        // base case
        if (x == maze.length-1 && y == maze.length-1) {
            return true;
        }
        if(isFeasible(x,y)){
            visited[x][y] = true;
            // we have to visit the next cells
            // going down
            if (dfs(x+1, y)){
                return true;
            }
            // going up
            if (dfs(x-1, y)){
                return true;
            }
            // going right
            if (dfs(x, y+1)){
                return true;
            }
            // going left
            if (dfs(x, y-1)){
                return true;
            }
        }
        return false;
    }
}
