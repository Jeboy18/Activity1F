class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    // In-Order Traversal (Left, Root, Right)
    void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    // Pre-Order Traversal (Root, Left, Right)
    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    // Post-Order Traversal (Left, Right, Root)
    void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        tree.root = new Node(10);
        tree.root.left = new Node(5);
        tree.root.right = new Node(15);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(8);
        tree.root.right.right = new Node(20);

        System.out.println("In-Order Traversal:");
        tree.inOrder(tree.root);
        System.out.println("\nPre-Order Traversal:");
        tree.preOrder(tree.root);
        System.out.println("\nPost-Order Traversal:");
        tree.postOrder(tree.root);
    }
}