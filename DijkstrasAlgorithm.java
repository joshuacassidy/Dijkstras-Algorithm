import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class DijkstrasAlgorithm {


    public String findShortestPath(Vertex start, Vertex target) {

        start.setDistance(0);
        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(start);

        while (!priorityQueue.isEmpty()) {
            Vertex vertex = priorityQueue.poll();

            for (Edge e: vertex.getAdjacencies()) {
                Vertex edgeTarget = e.getTarget();
                double newDistance = vertex.getDistance() + e.getWeight();
                if (newDistance < edgeTarget.getDistance()) {
                    priorityQueue.remove(edgeTarget);
                    edgeTarget.setDistance(newDistance);
                    edgeTarget.setPredecessor(vertex);
                    priorityQueue.add(edgeTarget);
                }
            }
        }

        return reconstructPath(target);

    }

    public String reconstructPath(Vertex targetVertex) {

        ArrayList<Vertex> shortestPath = new ArrayList<>();

        for (Vertex vertex = targetVertex; vertex != null; vertex = vertex.getPredecessor()) {
            shortestPath.add(vertex);
        }

        Collections.reverse(shortestPath);
        return shortestPath.toString();

    }


}
