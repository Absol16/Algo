package lists;

public class Node<E> {
        private E val;
        private Node<E> nextNode;

        /**
         * Constructs a node with a value and a pointer to a next node. If the next node is <code>null</code>, it means it is empty.
         *
         * @param val the node value.
         * @param n   the next node.
         */
        public Node(E val, Node<E> n) {
            this.val = val;
            this.nextNode = n;
        }

        /**
         * Constructs a node without a following node.
         *
         * @param val the node value.
         */
        public Node(E val) {
            this(val, null);
        }

        /**
         * Gets the node value.
         *
         * @return the node value.
         */
        public E getVal() {
            return val;
        }

        /**
         * Sets the node value.
         *
         * @param newVal the new node value.
         */
        public void setVal(E newVal) {
            this.val = newVal;
        }

        /**
         * Gets the next node.
         *
         * @return the next node object, can be <code>null</code>.
         */
        public Node<E> getNext() {
            return this.nextNode;
        }

        /**
         * Sets the next node.
         *
         * @param n a node to be set in place of the next node.
         */
        public void setNext(Node<E> n) {
            this.nextNode = n;
        }

        /**
         * Creates a string using the current node value and the next node value.
         *
         * @return the node string representation.
         */
        @Override
        public String toString() {
            if(nextNode != null) {
                return val + " -> " + nextNode.getVal();
            }
            else{
                return val + " -> " + null;
            }
        }
    }


