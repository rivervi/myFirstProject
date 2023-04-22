public class Integer implements Scalar {
    private int number;


    public Integer(int number){
        this.number = number;
    }

    public int getValue(){
        return this.number;
    }

    public String toString(){
        return String.valueOf(number);
    }

    // The functions Integer implemented from scalar
    public Integer add(Integer num){
        return new Integer(getValue() + num.getValue());
    }

    public Integer mul (Integer num){
        return new Integer(getValue() * num.getValue());
    }

    public Integer neg() {
        return new Integer(getValue() * -1);
    }

    public Integer power(int exponent){
        sum = 1;
        for(int i = 0; i < exponent; i++){
            sum = sum * getValue();
        }
        return new Integer(sum);
    }

    public int sign(){
        if(getValue() > 0)
            return 1;
        if(getValue() = 0)
            return 0;
        return -1;
    }

    public boolean equals(Object o){
        if (!o instanceof Integer)
            return false;
        if(o.getValue() != getValue())
            return false;
        return true;
    }
}
