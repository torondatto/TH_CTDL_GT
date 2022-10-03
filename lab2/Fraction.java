public class Fraction {
    private int number;
    private int denom;

    public Fraction(){
        number = 0;
        denom = 1;
    }

    public Fraction(int number, int denom){
        this.number = number;
        this.denom = denom;
    }

    public Fraction(Fraction f){
        this.number = f.number;
        this.denom = f.denom;
    }

    @Override
    public String toString() {
        return number + "/"+denom;
    }

    public boolean equals(Fraction f){
        return number / denom == f.number / f.denom ? true : false;                      
    }
}