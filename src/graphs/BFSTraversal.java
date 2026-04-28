package graphs;

import java.util.*;

/*
 * Graph BFS Traversal (Breadth-First Search)
 * Visits all vertices level by level from a source vertex.
 * Uses an adjacency list and a visited set to handle cycles.
 * Time: O(V + E)  Space: O(V)
 */
public class BFSTraversal {

    private final Map<Integer, List<Integer>> adjList = new HashMap<>();

    public void addEdge(int u, int v) {
        adjList.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        adjList.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    public List<Integer> bfs(int start) {
        List<Integer> order = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new ArrayDeque<>();

        visited.add(start);
        queue.offer(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            order.add(node);
            for (int neighbor : adjList.getOrDefault(node, Collections.emptyList())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
        return order;
    }

    public static void main(String[] args) {
        /*
         * Graph:
         *   0 - 1 - 3
         *   |   |
         *   2 - 4
         */
        BFSTraversal graph = new BFSTraversal();
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);

        System.out.println("BFS from 0: " + graph.bfs(0)); // [0, 1, 2, 3, 4]
    }
}
