public final class Fraction {

    private int numerator;
    
    private int denominator;
    
    public Fraction(int numerator,int denominator,boolean wantToReduce) {
        if (denominator == 0) {
            throw new IllegalArgumentException("The denominator is zero.");
        }
        if(numerator==0){
            this.numerator = 0;
            this.denominator = 1;
        }
        else{
        this.numerator = numerator;
        this.denominator = denominator;
        }
        if(denominator<0){
            this.numerator = -1*this.numerator;
            this.denominator = -1*this.denominator;
        }
        if(wantToReduce==true)
            this.reduce();
    }
    public Fraction(int num) {
        this.numerator = num;
        this.denominator = 1;
    }
    
    @Override
    public String toString() {
        if(denominator!=1)
        return numerator+"/"+denominator;
        else
            return numerator+"";
    }
    
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Fraction))
            return false;
        Fraction f = ((Fraction)obj);
        int gcd= Math2.gcd(numerator,denominator);
        f.reduce();
        if(this.numerator/gcd==f.numerator && this.denominator/gcd == f.denominator)
            return true;
        else
            return false;
    }
    
    public Fraction reduce(){
        int gcd = Math2.gcd(numerator,denominator);
        numerator = numerator/gcd;
        denominator = denominator/gcd;
        return this;
    }
    
    //Cannot decide weather to make static methods or not so I randomly picked one. 
    public static Fraction add(Fraction f1,Fraction f2,boolean w){
        return new Fraction(f1.numerator*f2.denominator+f2.numerator*f1.denominator,f1.denominator*f2.denominator,w);
    }
    public static Fraction sub(Fraction f1,Fraction f2,boolean w){
        return new Fraction(f1.numerator*f2.denominator-f2.numerator*f1.denominator,f1.denominator*f2.denominator,w);
    }
    public static Fraction mul(Fraction f1,Fraction f2,boolean w){
        return new Fraction(f1.numerator*f2.numerator,f1.denominator*f2.denominator,w);
    }
    public static Fraction div(Fraction f1,Fraction f2,boolean w){
        return new Fraction(f1.numerator*f2.denominator,f1.denominator*f2.numerator,w);
    }
    
    
    }


