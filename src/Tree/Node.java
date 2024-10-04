package Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Node {
    private final List<Node> nodeList;
    private Integer val;

    /**
     * Constructs a node from a value and sets the children list to an empty list.
     *
     * @param val the value of the node.
     */
    public Node(int val) {
        this.val = val;
        this.nodeList = new ArrayList<>();
    }

    public Node() {
        this.val = null;
        this.nodeList = new ArrayList<>();
    }

    /**
     * Gets the value of the node.
     *
     * @return the value of the node.
     */
    public int getVal() {
        return val;
    }

    /**
     * Sets the value of the node.
     *
     * @param val the new value of the node.
     */
    public void setVal(int val) {
        this.val = val;
    }

    /**
     * Gets the number of children of a node.
     *
     * @return the size of the underlying children list.
     */
    public int getNbChildren() {
        return nodeList.size();
    }

    /**
     * Gets the child node at a given index in the children list.
     *
     * @param i the index of the node.
     * @return the child node if there is any at that index.
     */
    public Node getChild(int i) {
        return nodeList.get(i);
    }

    /**
     * Sets the child node at a given index in the children list.
     *
     * @param i    the index of the node.
     * @param node the new node.
     */
    public void setChild(int i, Node node) {
        nodeList.set(i, node);
    }

    /**
     * Appends a new child to the children list.
     *
     * @param node the new node to append.
     */
    public void addChild(Node node) {
        nodeList.add(node);
    }


    /**
     * Adds all nodes in parameters to the node children list.
     *
     * @param nodes the nodes to add the the children list.
     */
    @SafeVarargs
    public final void addAll(Node... nodes) {
        nodeList.addAll(Arrays.asList(nodes));
    }

    /**
     * Removes a child at a given index in the children list.
     *
     * @param i the index to remove the child at.
     */
    public void removeChild(int i) {
        nodeList.remove(i);
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                '}';
    }
}

