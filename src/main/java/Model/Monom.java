package Model;

import java.util.Objects;

public class Monom implements  Comparable{
    private int putere;
    private float coef;

    public Monom(int putere, float coef) {
        this.putere = putere;
        this.coef = coef;
    }

    public Monom(String group) {
    }

    public int getPutere() {
        return putere;
    }

    public float getCoef() {
        return coef;
    }

    public void setPutere(int putere) {
        this.putere = putere;
    }

    public void setCoef(float coef) {
        this.coef = coef;
    }

    @Override
    public boolean equals(Object a) {
        if(this == a)
            return true;
        if(a == null || getClass() != a.getClass())
            return false;
        Monom mon = (Monom) a;

        return Float.compare(mon.coef, coef) == 0 && putere == mon.putere;
    }

    @Override
    public int hashCode() {
        return Objects.hash(putere, coef);
    }

    @Override
    public String toString() {
        return "Model.Monom{" +
                "putere=" + putere +
                ", coef=" + coef +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        int p =  ((Monom)o).getPutere();
        return (p - this.putere);
    }

    /*public String verifMono(){



    }*/
}
