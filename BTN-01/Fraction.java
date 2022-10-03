public class Fraction {
    private int numer;
    private int denom;

    public Fraction() {
        numer = 0;
        denom = 1;
    }

    public Fraction(int numer, int denom) {
        this.numer = numer;
        this.denom = denom;
    }

    public Fraction(Fraction f) {
        this.numer = f.numer;
        this.denom = f.denom;
    }
}
