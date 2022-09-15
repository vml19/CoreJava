package dsa.binarysearch;

public class BinaryTree {
    Node root;

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        }
        return current;
    }

    public boolean searchKey(int key) {
        return recursiveSearchKey(root, key);
    }

    private boolean recursiveSearchKey(Node current, int key) {
        if (current == null) return false;
        if (current.value == key) return true;

        if (current.value > key)
            return recursiveSearchKey(current.left, key);
        else
            return recursiveSearchKey(current.right, key);
    }
}

