class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    // Insert a key into the BST
    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    // Function to find the Lowest Common Ancestor (LCA)
    Node findLCA(Node root, Node x, Node y) {
        if (root == null)
            return null;

        if (root.key > x.key && root.key > y.key)
            return findLCA(root.left, x, y);
        else if (root.key < x.key && root.key < y.key)
            return findLCA(root.right, x, y);
        else
            return root;
    }

    // Wrapper function to find the LCA
    Node findLCAWrapper(Node x, Node y) {
        return findLCA(root, x, y);
    }
}

public class Main {
    public static void main(String[] args) {
        // Constructing the BST
        BinarySearchTree bst = new BinarySearchTree();
        int[] keys = {20, 10, 30, 5, 15, 25, 35};

        for (int key : keys) {
            bst.insert(key);
        }

        // Nodes x and y
        Node x = new Node(15);
        Node y = new Node(25);

        // Finding the Lowest Common Ancestor (LCA) of x and y
        Node lca = bst.findLCAWrapper(x, y);

        if (lca != null) {
            System.out.println("Lowest Common Ancestor of " + x.key + " and " + y.key + " is: " + lca.key);
        } else {
            System.out.println("Either " + x.key + " or " + y.key + " is not present in the BST.");
        }
    }
}
