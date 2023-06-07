

import java.util.LinkedList;
import java.util.Queue;
import java.io.*;

public class latihan1{
    private int node;
    private LinkedList<Integer> adj[];
    private Queue<Integer> que;

    latihan1(int v){
        node = v;
        adj = new LinkedList[node];
        for(int i=0; i<v; i++){
            adj[i]=new LinkedList<>();
        }
        que = new LinkedList<Integer>();
    }

    void insertEdge(int v, int w){
        adj[v].add(w);
    }

    void BFS(int n){
        boolean nodes[] = new boolean[node];

        int a = 0;
        nodes[n]=true;
        que.add(n);

        while (que.size() != 0) {
            n = que.poll();
            System.out.println(n+" ");
            for(int i=0; i<adj[n].size(); i++){
                a = adj[n].get(i);
                if (!nodes[a]) {
                    nodes[a] = true;
                    que.add(a);
                }
            }
        }
    }

    public static void main(String[] args) {
        latihan1 test = new latihan1(6);
        test.insertEdge(0, 1);
        test.insertEdge(0, 3);
        test.insertEdge(0, 4);
        test.insertEdge(4, 5);
        test.insertEdge(3, 5);
        test.insertEdge(1, 2);
        test.insertEdge(1, 0);
        test.insertEdge(2, 1);
        test.insertEdge(4, 1);
        test.insertEdge(3, 1);
        test.insertEdge(5, 4);
        test.insertEdge(5, 3);

        System.out.println("fopasjofsa : ");
        test.BFS(0);

    }
}