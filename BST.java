// Node1 class
class Node1 {
    int data;
    Node1 left, right;

    Node1(int value) {
        this.data = value;
        this.left = null;
        this.right = null;
    }
}

// BST class
public class BST {
    Node1 root;

    // Insert a value into the BST
    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    // Recursive helper
    private Node1 insertRecursive(Node1 current, int value) {
        if (current == null) {
            return new Node1(value);
        }
        if (value < current.data) {
            current.left = insertRecursive(current.left, value);
        } else if (value > current.data) {
            current.right = insertRecursive(current.right, value);
        }
        // if value == current.data, do nothing (no duplicates)
        return current;
    }

    // Preorder (Root → Left → Right)
    public void preorder(Node1 node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // Inorder (Left → Root → Right)
    public void inorder(Node1 node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // Postorder (Left → Right → Root)
    public void postorder(Node1 node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(10);
        tree.insert(5);
        tree.insert(20);
        tree.insert(2);
        tree.insert(7);

        System.out.println("Tree created successfully\n");

        System.out.print("Preorder: ");
        tree.preorder(tree.root);
        System.out.println();

        System.out.print("Inorder: ");
        tree.inorder(tree.root);
        System.out.println();

        System.out.print("Postorder: ");
        tree.postorder(tree.root);
        System.out.println();
    }
}