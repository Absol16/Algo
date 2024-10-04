package Tree;

public class Tree {
    private Node root;

    /**
     * Builds a tree with an empty root node.
     */
    public Tree() {
        this.root = null;
    }

    /**
     * Gets the root node.
     *
     * @return the root node.
     */
    public Node getRoot() {
        return root;
    }

    /**
     * Sets the root node.
     *
     * @param root the root node.
     */
    public void setRoot(Node root) {
        this.root = root;
    }
}

