public class Rational {

    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator(){   // Those four functions will help with the implement of the other functions
        return this.numerator;
    }
    public int getDenominator(){
        return this.denominator;
    }

    public static int findGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return findGCD(num2, num1 % num2);
    }
    public static String reduceFraction(int numerator, int denominator) {
        int gcd = findGCD(numerator, denominator);
        int reducedNumerator = numerator / gcd;
        int reducedDenominator = denominator / gcd;
        return (reducedNumerator + "/" + reducedDenominator);
    }
    //end of helpful functions


    public Rational reduce(){
        String s = reduceFraction(getNumerator(), getDenominator());
        String[] parts = s.split("/");
        return new Rational(int(part[0]), int(part[1]));
    }

    public String toString(){
        String s = reduceFraction(getNumerator(), getDenominator());
        String[] parts = s.split("/");
        if(parts[1] != 1)
            return s;
        return part[0]
    }
}
