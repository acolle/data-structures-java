package binarysearchtree;

public class Tree {

    private TreeNode root;

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public TreeNode get(int value) {
        if (root != null) {
            return root.get(value);
        }
        return null;
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subtreeRoot, int value) {
        if (subtreeRoot == null) {
            return subtreeRoot;
        }

        if (value < subtreeRoot.getData()) {
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
        } else if (value > subtreeRoot.getData()) {
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
        } else {
            // At this point we found the node to delete
            if (subtreeRoot.getLeftChild() == null) {
                // If no left child return either null or right child (replaced with)
                return subtreeRoot.getRightChild();
            } else if (subtreeRoot.getRightChild() == null) {
                // If no right child return either null or left child (replaced with)
                return subtreeRoot.getLeftChild();
            } else {
                // Case where node has 2 children
                // Option 1
                // If replacement node from the right subtree we select the smallest value in the right subtree
                subtreeRoot.setData(subtreeRoot.getRightChild().min());
                // Delete the node that has the smallest value in the right subtree
                subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getData()));

                // Option 2
                // If replacement node from the left subtree we select the largest value in the left subtree
//                subtreeRoot.setData(subtreeRoot.getLeftChild().max());
                // Delete the node that has the largest value in the left subtree
                subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), subtreeRoot.getData()));
            }
        }
        return subtreeRoot;
    }

    public int min() {
        if (root != null) {
            return root.min();
        }
        return Integer.MIN_VALUE;
    }

    public int max() {
        if (root != null) {
            return root.max();
        }
        return Integer.MAX_VALUE;
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }
    public void traversePreOrder() {
        if (root != null) {
            root.traversePreOrder();
        }
    }

    public void traversePostOrder() {
        if (root != null) {
            root.traversePostOrder();
        }
    }

}
