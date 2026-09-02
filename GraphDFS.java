 import java.util.*;

public class GraphDFS {
    private int vertices;               // number of vertices
    private List<List<Integer>> adj;    // adjacency list

    // Constructor
    public GraphDFS(int v) {
        vertices = v;
        adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
    }

    // Add edge (undirected graph)
    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    // DFS utility
    private void dfsUtil(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");   // print current node

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited);
            }
        }
    }

    // DFS traversal
    public void dfs(int start) {
        boolean[] visited = new boolean[vertices];
        System.out.println("DFS starting from node " + start + ":");
        dfsUtil(start, visited);
    }

    public static void main(String[] args) {
        GraphDFS g = new GraphDFS(7); // 7 vertices: 0..6

        // Add edges
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 5);
        g.addEdge(2, 6);

        // Perform DFS
        g.dfs(0);
    }
}

