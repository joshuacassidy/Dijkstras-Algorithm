public class Main {

    public static void main(String[] args) {

        Vertex vertex1 = new Vertex("A");
        Vertex vertex2 = new Vertex("B");
        Vertex vertex3 = new Vertex("C");
        Vertex vertex4 = new Vertex("D");
        Vertex vertex5 = new Vertex("E");

        vertex1.addNeighbour(new Edge(8, vertex1, vertex2));
        vertex1.addNeighbour(new Edge(9, vertex1, vertex4));

        vertex2.addNeighbour(new Edge(16, vertex2, vertex5));
        vertex2.addNeighbour(new Edge(24, vertex2, vertex3));

        vertex4.addNeighbour(new Edge(7, vertex4, vertex5));

        DijkstrasAlgorithm dijkstras = new DijkstrasAlgorithm();
        System.out.println(dijkstras.findShortestPath(vertex1, vertex5));


    }

}
