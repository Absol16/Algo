import lists.Node;

import java.util.ArrayList;
import java.util.List;

public class interClassementBillal {

    /**
     * Exemple : l’inter-classement des listes (2, 5, 9., 8, 10) et (7, 4, 3.) donnera comme résultat la
     * liste (2, 7, 5, 4, 9, 3, 8, 10)
     *
     * liste (2,7,5,4,9.,3,8
     */

    public static void interClassement(LinkedList<Integer> list1,LinkedList<Integer> list2){
        if(list1.isEmpty()||list2.isEmpty()){
            throw new IllegalArgumentException("list empty");
        }
        if (list1.getFirst()==null|| list2.getFirst()==null){
            throw new IllegalArgumentException("list empty");
        }
        Node<Integer> current1= list1.getFirst();
        Node<Integer> current2= list2.getFirst();

        while(current1!=null|| current2!=null) {
            if (current2 != null) {
                list1.insertAfter(current1, current2.getVal());
                current2 = current2.getNext();
            }
            current1 = current1.getNext().getNext();
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>(2, 5, 9,8,10);
        LinkedList<Integer> l2 = new LinkedList<>(7, 4, 3);
        System.out.println(l);
        System.out.println(l2);
        interClassement(l,l2);
        System.out.println(l);
    }

    public static class Node2<T> {
        T valeur;
        List<Node2<T>> listeFils;

        public Node2(T valeur) {
            this.valeur = valeur;
            this.listeFils = new ArrayList<>();
        }

        public T getValeur() {
            return valeur;
        }

        public int getNbFils() {
            return listeFils.size();
        }

        public void setValeur(T valeur) {
            this.valeur = valeur;
        }

        public Node2<T> getFils(int i) {
            return listeFils.get(i);
        }

        public void setFils(int i, Node2<T> noeud) {
            listeFils.set(i, noeud);
        }

        public void ajouterFils(Node2<T> noeud) {
            listeFils.add(noeud);
        }

        public void supprimerFils(int i) {
            listeFils.remove(i);
        }

        @Override
        public String toString() {
            return '\n' + toString("").toString();
        }

        public StringBuilder toString(String prefixe) {
            StringBuilder s = new StringBuilder();
            s.append(prefixe).append("├").append(valeur).append('\n');
            for (int i = 0; i < listeFils.size(); i++) {
                Node2<T> noeud = listeFils.get(i);
                s.append(noeud.toString(prefixe + "| "));
            }
            return s;
        }

    }
}
