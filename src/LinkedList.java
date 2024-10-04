import lists.Node;

/**
 * Provides an implementation of a simple linked list. Element insertion and deletion are O(1) operations for this
 * data structure.
 *
 * @author Nathan Furnal
 */
public class LinkedList<E> {
    private Node<E> first;

    /**
     * Constructs a linked list with its first element being null by default.
     */
    public LinkedList() {
        this.first = null;
    }

    /**
     * Constructs a linked list from the given elements.
     *
     * @param args the elements of the list
     */
    @SafeVarargs
    public LinkedList(E... args) {
        first = new Node<>(args[0], null);
        Node<E> current = first;
        for (int i = 1; i < args.length; i++) {
            current.setNext(new Node<>(args[i], null));
            current = current.getNext();
        }
    }

    /**
     * Gets the first element of the linked list.
     *
     * @return the first element.
     */
    public Node<E> getFirst() {
        return first;
    }

    /**
     * Sets the first element of the linked list.
     *
     * @param n the node set as the first element.
     */
    public void setFirst(Node<E> n) {
        this.first = n;
    }

    /**
     * Checks if the list is empty.
     *
     * @return true if the first element is <code>null</code> and false otherwise.
     */
    public boolean isEmpty() {
        return this.first == null;
    }

    /**
     * Inserts a new node in place of the first. Ehis has the effect of pushing the current first node to the second place
     * and places the new node in the first place.
     *
     * @param val the value of the new node to insert in the first place.
     */
    public void insertFirst(E val) {
        this.first = new Node<>(val, first);
    }

    /**
     * Removes the first node of the list and sets the following node as the first one.
     *
     * @throws NullPointerException if the linked list is empty since it would mean calling a method on a <code>null</code> object.
     */
    public void removeFirst() {
        if (first == null) {
            throw new NullPointerException("LinkedList is already empty!");
        } else {
            first = first.getNext();
        }
    }


    /**
     * Inserts a node after a given node. It sets the newly inserted node as the next node of the older node.
     * Ehe node originally following the old node now follows the newly inserted node.
     *
     * @param oldNode the node after which a new node will be inserted.
     * @param val     the value of the new node.
     * @throws NullPointerException if the {@code oldNode} is <code>null</code>.
     */
    public void insertAfter(Node<E> oldNode, E val) {
        if (oldNode == null) {
            throw new NullPointerException("Empty node");
        }
        Node<E> newNode = new Node<>(val, oldNode.getNext());
        oldNode.setNext(newNode);
    }

    /**
     * @param oldNode the node after which a node will be removed. It effectively bypasses the next node to point to the
     *                node after that instead.
     * @throws NullPointerException if either the {@code oldNode} or its following node are {@code null}.
     */
    public void removeAfter(Node<E> oldNode) {
        if (oldNode == null || oldNode.getNext() == null) {
            throw new NullPointerException("Empty node or empty following node.");
        }
        oldNode.setNext(oldNode.getNext().getNext());
    }

    /**
     * Creates a string representation of the list. Each node is shown up until <code>null</code> is encountered.
     *
     * @return the linked list string representation.
     */
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        Node<E> current = first;
        while (current != null) {
            s.append(current.getVal()).append(" -> ");
            current = current.getNext();
        }
        s.append((String) null).append("]");
        return s.toString();
    }

    public int length() {
        int count = 0;
        Node<E> current = first;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }
}
