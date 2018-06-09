import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex> {

    private String name;
    private List<Edge> adjacencies;
    private boolean visited;
    private Vertex predecessor;
    private double distance;

    public Vertex(String name) {
        this.name = name;
        adjacencies = new ArrayList<>();
        distance = Double.MAX_VALUE;
    }

    public void addNeighbour(Edge edge) {
        adjacencies.add(edge);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Edge> getAdjacencies() {
        return adjacencies;
    }

    public void setAdjacencies(List<Edge> adjacencies) {
        this.adjacencies = adjacencies;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return  name;
    }

    @Override
    public int compareTo(Vertex vertex) {
        return Double.compare(distance, vertex.getDistance());
    }
}
