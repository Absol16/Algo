public class ArbreBinary<T> {

    NodeBinary<T> racine;

    public ArbreBinary() {
    }

    public NodeBinary<T> getRacine() {
        return racine;
    }

    public void setRacine(NodeBinary<T> racine) {
        this.racine = racine;
    }

    @Override
    public String toString() {
        return "Arbre{" + "racine=" + racine + '}';
    }


}
