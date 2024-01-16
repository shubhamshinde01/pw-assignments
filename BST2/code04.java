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

    // Function to find the inorder predecessor or previous greater node
    Node findInorderPredecessor(Node root, int key) {
        Node predecessor = null;

        while (root != null) {
            if (key <= root.key) {
                root = root.left;
            } else {
                predecessor = root;
                root = root.right;
            }
        }

        return predecessor;
    }

    // Wrapper function to find the inorder predecessor
    Node findInorderPredecessorWrapper(int key) {
        return findInorderPredecessor(root, key);
    }
}

public class Main {
    public static void main(String[] args) {
        // Constructing the BST
        BinarySearchTree bst = new BinarySearchTree();
        int[] keys = {20, 15, 25, 10, 18, 22, 30};

        for (int key : keys) {
            bst.insert(key);
        }

        // Finding the inorder predecessor for the key 18
        int targetKey = 18;
        Node predecessor = bst.findInorderPredecessorWrapper(targetKey);

        if (predecessor != null) {
            System.out.println("Inorder predecessor of " + targetKey + " is: " + predecessor.key);
        } else {
            System.out.println(targetKey + " is not present in the BST.");
        }
    }
}
