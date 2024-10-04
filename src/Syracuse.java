import lists.Node;

public class Syracuse {
    /**
     * Voici la définition d’une suite de Syracuse selon Wikipedia,.
     * « En mathématique, on appelle suite de Syracuse une suite d’entiers naturels définie de
     * la manière suivante : on part d’un nombre entier strictement positif ; s’il est pair, on le
     * divise par 2 ; s’il est impair, on le multiplie par 3 et on ajoute 1. En répétant l’opération,
     * on obtient une suite d’entier strictement positifs dont chacun ne dépend que de son
     * prédécesseur.
     * Par exemple, à partir de 14, on construit la suite des nombres : 14, 7, 22, 11, 34, 17, 52,
     * 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1.
     * Après que le nombre 1 a été atteint, la suite des valeurs (1, 4, 2...) se répète indéfiniment
     * en un cycle de longueur 3 appelé cycle trivial. »
     * Donnez une fonction récursive syracuse(n): ListeChaînée<Integer> qui retourne une
     * liste chaînée d’entiers contenant tous les éléments de la suite de Syracuse à partir du
     * n donné jusqu’à atteindre 1. Exemple, si n = 3 est l’entrée, on aura la liste chainée
     * suivante en sortie :
     * 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1
     */

    static LinkedList<Integer> recurSiracuse(LinkedList<Integer> list, int n, Node<Integer> node) {
        if (n == 1) {
            return list;
        }
        else if (n % 2 == 0) {
            n /= 2;
        }else{
            n = n*3+1;
        }
        node.setNext(new Node<Integer>(n));
        list.insertAfter(node, node.getNext().getVal());
        node = node.getNext();
        return recurSiracuse(list, n, node);
    }

    public static LinkedList<Integer> syracuse(int n){
        LinkedList<Integer> list= new LinkedList<>();
        LinkedList<Integer> l;
        Node<Integer> node = new Node<>(n);
        list.insertFirst(node.getVal());
        l = recurSiracuse(list, node.getVal(), node);
        return l;
    }

    public static void main(String[] args) {

        System.out.println(syracuse(3));

    }
}
