package Test;

public class Struktural {
    public Node root;

    public boolean isRootNull() {
        return this.root == null;
    }

    public boolean isGreater(int value1, int value2) {
        if (value1 < value2) {
            return true;
        }

        return false;
    }

    public void isAddData(String nama, int priority) {
        this.root = isAddRoot(this.root, new Node(nama, priority));
    }

    // public Node isAddRoot(Node root, Node isAddData){
    // if(this.node == null){
    // this.node = isAddData;
    // }
    // else{
    // if(isGreater(isAddData.priority, root.priority)){
    // root.kiri = isAddRoot(root.kiri, isAddData);
    // }
    // else{
    // root.kanan = isAddRoot(root.kanan, isAddData);
    // }
    // }
    // return root;
    // }

    public Node isAddRoot(Node root, Node isAddData) {
        if (isRootNull()) {
            root = isAddData;
            return root;
        }

        System.out.println("masuk");
        if (isGreater(isAddData.priority, root.priority)) {
            System.out.println("masuk3");
            root.kiri = isAddRoot(root.kiri, isAddData);
            return root;
        } else {
            System.out.println("masuk2");
            root.kanan = isAddRoot(root.kanan, isAddData);
            return root;
        }

        // int newData = isGreater(tambahData.data.charAt(0));
        // int rootData = isGreater(root.data.charAt(0));

        // if (newData < rootData) {
        // root.left = tambahData(root.left, tambahData);
        // } else {
        // root.right = tambahData(root.right, tambahData);
        // }
    }

    public static void main(String[] args) {
        Struktural node = new Struktural();
        System.out.println(node.isRootNull());
        node.isAddData("test", 5);
        System.out.println(node.root.priority);
        System.out.println(node.isRootNull());
        node.isAddData("test", 6);
        // System.out.println(node.node.kiri.priority);
    }
}
