public class Fraction {
    private int num;
    private int den;


    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;
        if (den < 0){
            this.num =-num;
            this.den =-den;
        }
    }


    public Fraction(int num) {
        this.num = num;
        this.den = 1;
    }

    public Fraction(String frac){
        
    }


    public int Num() {
        return num;
    }

    public int Den() {
        return den;
    }


    @Override
    public String toString() {
        if (den != 1){
            return num + "/"+ den;
        }
        return num + "";
    }

}
