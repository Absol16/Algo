package Tree;

public class TreeEx7 {

    public static Integer nodeSum(Node node) {
        if (node.getNbChildren() == 0)
            return node.getVal();
        Integer sum = 0;
        for (int i = 0; i < node.getNbChildren(); i++) {
            sum += nodeSum(node.getChild(i));
        }
        node.setVal(sum);
        return sum;
    }

    public static void main(String[] args) {
        Node root = new Node();
        Node n1 = new Node(7);
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node(4);
        Node n5 = new Node(9);
        Node n6 = new Node(9);
        root.addAll(n1, n2);
        n2.addAll(n3, n4);
        n3.addAll(n5, n6);
        Tree tree = new Tree();
        tree.setRoot(root);
        System.out.println(nodeSum(tree.getRoot())); // 20
    }
}

