public class Monomial {

    private int exponent;
    private Scalar coefficient;

    public Monomial(int exponent, Scalar coefficient){
        this.exponent = exponent;
        this.coefficient = coefficient;
    }

    public int getExponent() {     // Those functions will help with the implement of reduce
        return exponent;
    }
    public Integer getCoefficient() {
        return new Integer(coefficient);
    }
    //  end of helpful functions

    public Monomial add(Monomial m){
        if(getExponent() != m.getExponent())
            return null;
        return new Monomial(getExponent(), getCoefficient() + m.getCoefficient());
    }

    public Monomial mull(Monomial m){
        return new Monomial(getExponent() + m.getExponent(), getCoefficient() + m.getCoefficient())
    }

    public Scalar evaluate(Scalar S){
        return (new Integer(S.getValue().power(getExponent()) * 2)).reduce();
    }

    public Monomial derivative(){
        return new Monomial(getExponent() - 1, getCoefficient() * getExponent())
    }

    public int sign(){
        if(getCoefficient() > 0)
            return 1;
        if(getCoefficient() = 0)
            return 0;
        return -1;
    }

    public boolean equals(Object o) {
        if (!o instanceof Monomial)
            return false;
        if(o.getExponent != getExponent() | o.getCoefficient() != getCoefficient() )
            return false;
        return true;
    }

    public String toString(){
        if (getExponent() == 0)
            return "1";
        if(getCoefficient() == 1)
            return "x^" + String.ValueOf(getExponent());
        if ((getCoefficient() == -1))
            return "-x^" + getExponent().toString();
        return (getCoefficient().reduce()).toString() + "x^" + String.valueOf(getExponent());
    }
}
