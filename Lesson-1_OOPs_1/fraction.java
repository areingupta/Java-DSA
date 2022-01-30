package problem_1;

public class fraction {

    private int numerator;
    private int denominator;

    public fraction(int numerator, int denominator){

        this.numerator = numerator;
        if (denominator == 0){
            // Error out
        }
        this.denominator = denominator;
        simplify();

    }

    private void simplify(){

        int gcd = 1;
        int smaller = Math.min(numerator,denominator);

        for (int i = 2; i <= smaller; i++){
            if (numerator%i == 0 && denominator%i==0){
                gcd = i;
            }
        }
        numerator = numerator/gcd;
        denominator = denominator/gcd;
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
        simplify();
    }

    public void setDenominator(int denominator){
        if (denominator == 0){
            //Error out !
        }
        this.denominator = denominator;
        simplify();
    }

    public void add(fraction f2){

        this.numerator = (this.numerator*f2.denominator) + (this.denominator*f2.numerator);

        this.denominator = this.denominator*f2.denominator;

        simplify();

    }

    void multiply(fraction f2){

        this.numerator = this.numerator*f2.numerator;
        this.denominator = this.denominator* f2.denominator;
        simplify();
    }

    public static fraction add(fraction f1, fraction f2){

        int newNum = (f1.numerator*f2.denominator) + (f1.denominator*f2.numerator);
        int newDen = f1.denominator* f2.denominator;
        fraction f = new fraction(newNum, newDen);
        return f;
    }

    public void print(){
        if (denominator == 1){
            System.out.println(numerator);
        } else {
            System.out.println(numerator + "/" + denominator);
        }
    }

}
