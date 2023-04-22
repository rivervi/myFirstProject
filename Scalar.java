public interface Scalar {

    public Int getValue();  //return the value

    public Scalar add(Scalar s);  // returns new scalar which is the sum of both scalars

    public Scalar mul(Scalar s);  // returns new scalar which is the multiplications of both scalars

    public Scalar neg();  // returns new scalar which is the multiplications the scalar with -1

    public Scalar power(int exponent);  // returns new scalar which is the the scalar with the power of "exponent

    public int sign();  // returns 1 if the scalar is positive, 0 if the scalar is equals to 0, -1 if it is negative

    public boolean equals(Object O);   //if both scalars are equal
}
