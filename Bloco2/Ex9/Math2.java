public class Math2 {
    public static int gcd(int a,int b){
        if(a<0)
            a=-1*a;
        if(b<0)
            b=-1*b;
        int t;
        while(b!=0){
            t=b;
            b = a%b;
            a = t;          
        }
        return a;
    }
}
