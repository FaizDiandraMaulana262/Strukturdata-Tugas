public class BinaryTree {
    public Node root;

    public void NewNode(int data){
        root = NewNode(root, new Node(data));
    }

    private Node NewNode(Node root, Node newData){
        if (root == null) {
            root = newData;
            return root;
        }

        if (newData.data < root.data) {
            root.left = NewNode(root.left, newData);
        }
        else {
            root.right = NewNode(root.right, newData);
        }
        return root;
    }

    public void inOrder(Node node){
        if (node != null) {
            inOrder(node.left);
            System.out.println(node.data + " ");
            inOrder(node.right);
        }
    }

    public void preOrder(Node node){
        if (node != null) {
            preOrder(node.right);
            System.out.println(node.data + " ");
            preOrder(node.left);
        }
    }

    public void postOrder(Node node){
        
    }
}
