import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

    private final Map<Integer, List<Integer>> adjacencyList;
    private final List<Vertex> vertices;

    public Graph() {
        adjacencyList = new HashMap<>();
        vertices = new ArrayList<>();
    }

    public void addVertex(Vertex v) {
        vertices.add(v);
        adjacencyList.put(v.getId(), new ArrayList<>());
    }

    public void addEdge(int from, int to) {

        if (!adjacencyList.containsKey(from) || !adjacencyList.containsKey(to)) {
            System.out.println("Cannot create edge: vertex not found.");
            return;
        }

        adjacencyList.get(from).add(to);

        // undirected graph
        adjacencyList.get(to).add(from);
    }

    public void printGraph() {

        System.out.println("\n========== GRAPH STRUCTURE ==========");

        for (Vertex vertex : vertices) {

            int id = vertex.getId();

            System.out.print(vertex + " : ");

            List<Integer> neighbors = adjacencyList.get(id);

            for (Integer neighbor : neighbors) {
                System.out.print(neighbor + " ");
            }

            System.out.println();
        }

        System.out.println("=====================================");
    }

    public void bfs(int start) {

        if (!adjacencyList.containsKey(start)) {
            System.out.println("Start vertex not found.");
            return;
        }

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        System.out.println("\n--- Breadth-First Search ---");
        System.out.print("Traversal Order: ");

        while (!queue.isEmpty()) {

            int current = queue.poll();

            System.out.print(current + " ");

            List<Integer> neighbors = adjacencyList.get(current);

            for (Integer neighbor : neighbors) {

                if (!visited.contains(neighbor)) {

                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }

        System.out.println();
    }

    public void dfs(int start) {

        if (!adjacencyList.containsKey(start)) {
            System.out.println("Start vertex not found.");
            return;
        }

        Set<Integer> visited = new HashSet<>();

        System.out.println("\n--- Depth-First Search ---");
        System.out.print("Traversal Order: ");

        dfsHelper(start, visited);

        System.out.println();
    }

    private void dfsHelper(int current, Set<Integer> visited) {

        visited.add(current);

        System.out.print(current + " ");

        List<Integer> neighbors = adjacencyList.get(current);

        for (Integer neighbor : neighbors) {

            if (!visited.contains(neighbor)) {
                dfsHelper(neighbor, visited);
            }
        }
    }
}