package BFS;

public class Main {
    public static <T> void main(String[] args) {
        BFS_kegiatan BFS = new BFS_kegiatan<T>();

        BFS.addVertex(1);
        BFS.addVertex(2);
        BFS.addVertex(3);
        BFS.addVertex(4);
        BFS.addVertex(5);
        BFS.addVertex(6);
        BFS.addVertex(7);
        BFS.addVertex(8);
        BFS.addVertex(9);
        BFS.addVertex(10);
        BFS.addVertex(11);

        BFS.addEdge(1, 2);
        BFS.addEdge(2, 1);
        BFS.addEdge(2, 5);
        BFS.addEdge(5, 2);
        BFS.addEdge(5, 3);
        BFS.addEdge(1, 4);
        BFS.addEdge(4, 6);
        BFS.addEdge(5, 9);
        BFS.addEdge(9, 5);
        BFS.addEdge(6, 7);
        BFS.addEdge(7, 6);
        BFS.addEdge(5, 7);
        BFS.addEdge(9, 8);
        BFS.addEdge(8, 9);
        BFS.addEdge(8, 11);
        BFS.addEdge(7, 11);
        BFS.addEdge(11, 7);
        BFS.addEdge(11, 10);
        BFS.BFS( 10);
    }
}
