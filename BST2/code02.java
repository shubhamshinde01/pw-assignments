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

    // Function to find the k'th largest node
    void kthLargestUtil(Node root, int k, int[] count) {
        if (root == null || count[0] >= k) {
            return;
        }

        // Traverse the right subtree first
        kthLargestUtil(root.right, k, count);

        // Increment the count of visited nodes
        count[0]++;

        // If count reaches k, print the node
        if (count[0] == k) {
            System.out.println(k + "'th largest element is " + root.key);
            return;
        }

        // Traverse the left subtree
        kthLargestUtil(root.left, k, count);
    }

    // Wrapper function to find the k'th largest node
    void kthLargest(int k) {
        int[] count = {0};
        kthLargestUtil(root, k, count);
    }
}

public class Main {
    public static void main(String[] args) {
        // Constructing the BST
        BinarySearchTree bst = new BinarySearchTree();
        int[] keys = {50, 30, 70, 20, 40, 60, 80};

        for (int key : keys) {
            bst.insert(key);
        }

        // Finding the k'th largest node (k=2 in this example)
        int k = 2;
        bst.kthLargest(k);
    }
}
