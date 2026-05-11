public class EXPERIMENT {

    public void runTraversals(Graph graph, int startVertex) {

        long bfsStart = System.nanoTime();

        graph.bfs(startVertex);

        long bfsEnd = System.nanoTime();

        long dfsStart = System.nanoTime();

        graph.dfs(startVertex);

        long dfsEnd = System.nanoTime();

        System.out.println("\nPerformance Results:");
        System.out.println("BFS Time: " + (bfsEnd - bfsStart) + " ns");
        System.out.println("DFS Time: " + (dfsEnd - dfsStart) + " ns");
    }

    public void runMultipleTests() {

        int[] sizes = {10, 30, 100};

        for (int size : sizes) {

            System.out.println("\n==============================");
            System.out.println("Testing graph with " + size + " vertices");
            System.out.println("==============================");

            Graph graph = createGraph(size);

            long bfsStart = System.nanoTime();
            graph.bfs(1);
            long bfsEnd = System.nanoTime();

            long dfsStart = System.nanoTime();
            graph.dfs(1);
            long dfsEnd = System.nanoTime();

            printResults(size, bfsEnd - bfsStart, dfsEnd - dfsStart);
        }
    }

    private Graph createGraph(int size) {

        Graph graph = new Graph();

        for (int i = 1; i <= size; i++) {
            graph.addVertex(new Vertex(i));
        }

        for (int i = 1; i < size; i++) {

            graph.addEdge(i, i + 1);

            if (i + 2 <= size) {
                graph.addEdge(i, i + 2);
            }
        }

        return graph;
    }

    public void printResults(int size, long bfsTime, long dfsTime) {

        System.out.println("\n===== PERFORMANCE REPORT =====");
        System.out.println("Graph Size: " + size + " vertices");
        System.out.println("BFS Execution Time: " + bfsTime + " ns");
        System.out.println("DFS Execution Time: " + dfsTime + " ns");
        System.out.println("==============================");
    }
}