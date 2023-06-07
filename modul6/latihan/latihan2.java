import java.util.LinkedList;
import java.util.Iterator;

public class latihan2 {
    private LinkedList<Integer> adj[];
    private boolean visited[];

    latihan2(int v){
        adj = new LinkedList[v];
        visited = new boolean[v];

        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>(); 
        }
    }

    void insertEdge(int src, int dest){
        adj[src].add(dest);
    }

    void DFS(int vertex){
        visited[vertex] = true;
        System.out.print(vertex+" ");

        Iterator<Integer> it = adj[vertex].listIterator();

        while (it.hasNext()) {
            int n = it.next();
            if (!visited[n]) {
                DFS(n);
            }
        }
    }

    public static void main(String[] args) {
        latihan2 test = new latihan2(8);

        test.insertEdge(0, 1);
        test.insertEdge(0, 2);
        test.insertEdge(0, 3);
        test.insertEdge(1, 3);
        test.insertEdge(2, 4);
        test.insertEdge(3, 5);
        test.insertEdge(3, 6);
        test.insertEdge(4, 7);
        test.insertEdge(4, 5);
        test.insertEdge(5, 1);

        System.out.println("fdsfsdfs");
        test.DFS(0);
    }
}

