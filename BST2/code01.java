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

    // Search for a key in the BST
    boolean search(int key) {
        return searchRec(root, key);
    }

    boolean searchRec(Node root, int key) {
        while (root != null) {
            if (key == root.key)
                return true;

            if (key < root.key)
                root = root.left;
            else
                root = root.right;
        }

        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        // Constructing the BST
        BinarySearchTree bst = new BinarySearchTree();
        int[] keys = {15, 10, 20, 8, 12, 16, 25};

        for (int key : keys) {
            bst.insert(key);
        }

        // Searching for the element 25
        int searchKey = 25;
        if (bst.search(searchKey)) {
            System.out.println(searchKey + " found in the BST.");
        } else {
            System.out.println(searchKey + " not found in the BST.");
        }
    }
}
