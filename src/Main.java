public class Main {

    public static void main(String[] args) {

        Graph demoGraph = new Graph();

        for (int i = 1; i <= 5; i++) {
            demoGraph.addVertex(new Vertex(i));
        }

        demoGraph.addEdge(1, 2);
        demoGraph.addEdge(1, 3);
        demoGraph.addEdge(2, 4);
        demoGraph.addEdge(4, 5);

        demoGraph.printGraph();

        EXPERIMENT experiment = new EXPERIMENT();

        experiment.runTraversals(demoGraph, 1);

        experiment.runMultipleTests();
    }
}