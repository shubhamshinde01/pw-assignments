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

    // Function to find a pair with a given sum in the BST
    boolean findPairUtil(Node root, int target, HashSet<Integer> set) {
        if (root == null)
            return false;

        // Check if the complement of the current node exists in the set
        if (set.contains(target - root.key)) {
            System.out.println("Pair with sum " + target + " found: (" + (target - root.key) + ", " + root.key + ")");
            return true;
        }

        // Add the current node's key to the set
        set.add(root.key);

        // Recur for left and right subtrees
        return findPairUtil(root.left, target, set) || findPairUtil(root.right, target, set);
    }

    // Wrapper function to find a pair with a given sum
    void findPair(int target) {
        HashSet<Integer> set = new HashSet<>();
        if (!findPairUtil(root, target, set)) {
            System.out.println("No pair found with sum " + target);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Constructing the BST
        BinarySearchTree bst = new BinarySearchTree();
        int[] keys = {8, 6, 10, 5, 7, 9, 11};

        for (int key : keys) {
            bst.insert(key);
        }

        // Finding a pair with sum 14
        int targetSum = 14;
        bst.findPair(targetSum);
    }
}
