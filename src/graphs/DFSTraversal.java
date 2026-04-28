package graphs;

import java.util.*;

/*
 * Graph DFS Traversal (Depth-First Search)
 * Explores as far as possible along each branch before backtracking.
 * Uses an adjacency list and a visited set to handle cycles.
 * Time: O(V + E)  Space: O(V)
 */
public class DFSTraversal {

    private final Map<Integer, List<Integer>> adjList = new HashMap<>();

    public void addEdge(int u, int v) {
        adjList.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        adjList.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    public List<Integer> dfs(int start) {
        List<Integer> order = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        dfsHelper(start, visited, order);
        return order;
    }

    private void dfsHelper(int node, Set<Integer> visited, List<Integer> order) {
        visited.add(node);
        order.add(node);
        for (int neighbor : adjList.getOrDefault(node, Collections.emptyList())) {
            if (!visited.contains(neighbor)) {
                dfsHelper(neighbor, visited, order);
            }
        }
    }

    public static void main(String[] args) {
        /*
         * Graph:
         *   0 - 1 - 3
         *   |   |
         *   2 - 4
         */
        DFSTraversal graph = new DFSTraversal();
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);

        System.out.println("DFS from 0: " + graph.dfs(0)); // [0, 1, 3, 4, 2]
    }
}
