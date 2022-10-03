
public class Fraction {
    private int numer;
    private int demon;

    public Fraction() {
        this.numer = 0;
        this.demon = 1;
    }

    public Fraction(int x, int y) {
        this.numer = x;
        this.demon = y;
    }

    public Fraction(Fraction f) {
        this.numer = f.numer;
        this.demon = f.demon;
    }

    @Override
    public String toString() {
        return "numer = " + this.numer + " demon = " + this.demon;
    }

    public boolean equals(Object f) {
        if (!(f instanceof Fraction))
            return false;
        Fraction t = (Fraction) f;
        if ((this.numer / this.demon) != (t.numer / t.demon))
            return false;
        return true;
    }
}
