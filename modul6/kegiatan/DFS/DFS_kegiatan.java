package DFS;

import java.util.ArrayList;

public class DFS_kegiatan<T> {

    ArrayList<Integer> vertex = new ArrayList<>();
    ArrayList<Integer[]> edge = new ArrayList<>();
    ArrayList<ArrayList<?>> vertexNeighbors = new ArrayList<>();
    ArrayList<Integer> travelar = new ArrayList<>();

    public boolean addEdge(T v1, T v2) {
        int vertex1 = (Integer) v1;
        int vertex2 = (Integer) v2;
        Integer[] edge = { vertex1, vertex2 };

        if (this.vertex.indexOf(vertex1) != -1 && this.vertex.indexOf(vertex2) != -1) {
            if (this.edge.isEmpty()) {
                return this.edge.add(edge);
            } else {
                for (Integer[] integer : this.edge) {
                    if (integer[0] == vertex1 && integer[1] == vertex2) {
                        return false;
                    }
                }
                return this.edge.add(edge);
            }
        }
        return false;
    }

    public void debug() {
        for (Integer integer : this.travelar) {
            System.out.print(integer + " ");
        }
    }

    public boolean addVertex(T v) {
        Integer vertex = (Integer) v;

        if (this.vertex.isEmpty()) {
            return this.vertex.add(vertex);
        } else {
            if (this.vertex.indexOf(vertex) == -1) {
                return this.vertex.add(vertex);
            }
        }
        return false;
    }

    public void clear() {
        this.vertex.clear();
    }

    public boolean containsEdge(T v1, T v2) {
        int vertex1 = (Integer) v1;
        int vertex2 = (Integer) v2;
        int[] edge = { vertex1, vertex2 };

        if (this.edge.indexOf(edge) != -1) {
            return false;
        }
        return true;
    }

    public boolean containsVertex(T v) {
        int vertex = (Integer) v;

        if (this.vertex.indexOf(vertex) != -1) {
            return false;
        }
        return true;
    }

    public boolean isEmpty() {
        return this.vertex.isEmpty();
    }

    public void BFS(int search) {
        for (Integer vertex : this.vertex) {
            ArrayList<Integer> vertexTmp = new ArrayList<>();
            for (Integer[] edge : this.edge) {
                if (vertex == edge[0]) {
                    vertexTmp.add(edge[1]);
                }
            }
            this.vertexNeighbors.add(vertexTmp);
        }

        int index = 0;
        ArrayList<?> retrievedList1 = this.vertexNeighbors.get(0);
        this.travelar.add(index + 1);
        for (Object object : retrievedList1) {
            test((Integer) object);
        }

        for (Integer integer : this.travelar) {
            if (integer != search) {
                System.out.print(integer + " ");
            } else {
                System.out.print(integer + " ");
                break;
            }
        }
    }

    public void test(int ret) {
        this.travelar.add(ret);
        ArrayList<?> retrievedList1 = this.vertexNeighbors.get(ret - 1);
        for (Object object : retrievedList1) {
            if (this.travelar.indexOf((Integer) object) == -1) {
                test((Integer) object);
            }
        }
    }
}