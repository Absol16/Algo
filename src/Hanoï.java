public class Hanoï {
    public static void tourHanoï(int nbdisque, String depart, String arrivée, String milieu) {
        if (nbdisque > 0) {
            tourHanoï(nbdisque - 1, depart, milieu, arrivée);
            System.out.println("On deplace de " + depart + " vers " + arrivée);
            tourHanoï(nbdisque - 1, milieu, arrivée, depart);
        }
    }

    public static void main(String[] args) {
        tourHanoï(1, "gauche", "droite", "milieu");
        int [] tab = new int[10];
        System.out.println(tab[2]++);
    }
}
