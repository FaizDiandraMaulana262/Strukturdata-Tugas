package Versi2;

import java.util.jar.Attributes.Name;

public class Struktural {
    public Node root;

    public boolean isGreater(int value1, int value2) {
        return value1 > value2;
    }

    public boolean isRootNull(Node root) {
        return root == null;
    }

    public void isAddData(String nama, int priority) {
        root = isAddNode(this.root, new Node(nama, priority));
    }

    public Node isAddNode(Node root, Node isAddData) {
        if (isRootNull(root)) {
            root = isAddData;
        } else {
            if (isGreater(root.priority, isAddData.priority)) {
                root.kanan = isAddNode(root.kanan, isAddData);
                return root;
            } else {
                root.kiri = isAddNode(root.kiri, isAddData);
                return root;
            }
        }
        return root;
    }

    public void isInOrder(Node node) {
        if (node != null) {
            isInOrder(node.kiri);
            System.out.println(node.nama);
            isInOrder(node.kanan);
        }
    }

    public void isPostOrder(Node node) {
        if (node != null) {
            isPostOrder(node.kiri);
            isPostOrder(node.kanan);
            System.out.println(node.nama);
        }
    }

    public void isPreOrder(Node node) {
        if (node != null) {
            System.out.println(node.nama);
            isPreOrder(node.kiri);
            isPreOrder(node.kanan);
        }
    }
}