public class NodeBinary<T>{

    T valeur;
    NodeBinary<T> gauche;
    NodeBinary<T> droite;

    public NodeBinary(T valeur) {
        this.valeur = valeur;
    }

    public T getValeur() {
        return valeur;
    }

    public void setValeur(T valeur) {
        this.valeur = valeur;
    }

    public NodeBinary<T> getGauche() {
        return gauche;
    }

    public void setGauche(NodeBinary<T> gauche) {
        this.gauche = gauche;
    }

    public NodeBinary<T> getDroite() {
        return droite;
    }

    public void setDroite(NodeBinary<T> droite) {
        this.droite = droite;
    }

    @Override
    public String toString() {
        return '\n' + toString("").toString();
    }

    public StringBuilder toString(String prefixe) {
        StringBuilder s = new StringBuilder();
        s.append(prefixe).append("├").append(valeur).append('\n');
        if (this.gauche != null) s.append(this.gauche.toString(prefixe + "| "));
        if (this.droite != null) s.append(this.droite.toString(prefixe + "| "));
        return s;
    }

}



