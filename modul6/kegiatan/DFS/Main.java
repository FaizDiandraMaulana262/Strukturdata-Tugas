package DFS;

public class Main {
    public static <T> void main(String[] args) {
        DFS_kegiatan DFS = new DFS_kegiatan<T>();

        DFS.addVertex(1);
        DFS.addVertex(2);
        DFS.addVertex(3);
        DFS.addVertex(4);
        DFS.addVertex(5);
        DFS.addVertex(6);
        DFS.addVertex(7);
        DFS.addVertex(8);
        DFS.addVertex(9);
        DFS.addVertex(10);
        DFS.addVertex(11);

        DFS.addEdge(1, 2);
        DFS.addEdge(2, 1);
        DFS.addEdge(2, 5);
        DFS.addEdge(5, 2);
        DFS.addEdge(5, 3);
        DFS.addEdge(1, 4);
        DFS.addEdge(4, 6);
        DFS.addEdge(5, 9);
        DFS.addEdge(9, 5);
        DFS.addEdge(6, 7);
        DFS.addEdge(7, 6);
        DFS.addEdge(5, 7);
        DFS.addEdge(9, 8);
        DFS.addEdge(8, 9);
        DFS.addEdge(8, 11);
        DFS.addEdge(7, 11);
        DFS.addEdge(11, 7);
        DFS.addEdge(11, 10);
        DFS.BFS( 9);
    }
}
