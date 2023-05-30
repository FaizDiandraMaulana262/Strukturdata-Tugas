public class BinaryTree {
    public Node root;

    public int isGreater(char data){
        return (int) data;
    }

    public boolean isNull(){
        return this.root == null;
    }

    public void tambahData(String data){
        root = tambahData(this.root, new Node(data));
    }

    public Node tambahData(Node root, Node tambahData){
        if(root == null){
            root = tambahData;
            return root;
        }

        int newData = isGreater(tambahData.data.charAt(0));
        int rootData = isGreater(root.data.charAt(0));

        if (newData < rootData) {
            root.left = tambahData(root.left, tambahData);
        } else {
            root.right = tambahData(root.right, tambahData);
        }
        return root;
    }

    public void inOrder(Node node){
        if(node != null){
            inOrder(node.left);
            System.out.println(node.data);
            inOrder(node.right);
        }
    }

    public void postOrder(Node node){
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.data);
        }
    }

    public void preOrder(Node node){
        if (node != null) {
            System.out.println(node.data);
            postOrder(node.left);
            postOrder(node.right);
        }
    }

}
