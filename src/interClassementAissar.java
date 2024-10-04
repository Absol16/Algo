import lists.Node;


/**
 * Exemple : l’inter-classement des listes (2, 5, 9., 8, 10) et (7, 4, 3.) donnera comme résultat la
 * liste (2, 7, 5, 4, 9, 3, 8, 10)
 *
 * liste (2,7,5,4,9.,3,8
 */

public class interClassementAissar {

    public static LinkedList<Integer>interClassement(LinkedList<Integer> list1,LinkedList<Integer> list2){
        if(list1.isEmpty()||list2.isEmpty()){
            throw new IllegalArgumentException("list empty");
        }
        if (list1.getFirst()==null|| list2.getFirst()==null){
            throw new IllegalArgumentException("list empty");
        }

        Node<Integer> current1= list1.getFirst();
        Node<Integer> current2= list2.getFirst();

        LinkedList<Integer> list3 =new LinkedList<>();
        list3.insertFirst(current1.getVal());
        current1 = current1.getNext();
        Node<Integer> current3=list3.getFirst();

        while (current1!= null || current2!= null){
            if(current2!= null) {
                list3.insertAfter(current3, current2.getVal());
                current2 = current2.getNext();
                current3 = current3.getNext();
            }
            if(current1!= null){
                list3.insertAfter(current3, current1.getVal());
                current1 = current1.getNext();
                current3 = current3.getNext();
            }
        }

        return list3;
    }

    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>(2, 5, 9);
        LinkedList<Integer> l2 = new LinkedList<>(7, 4, 3,1,11,12);
        System.out.println(l);
        System.out.println(l2);
        LinkedList<Integer> l3= interClassement(l,l2);
        System.out.println(l3);
    }

}
