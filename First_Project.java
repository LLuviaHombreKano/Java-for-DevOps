public class First_Project{

public static void main(String[] args) {
    //Calling the class
    MathUtils mathutils = new MathUtils();

    //Sum
    System.out.println("Sum:" + mathutils.add(3,3));

    //Difference
    System.out.println("Difference:" + mathutils.subtract(9,3));

    //Product
    System.out.println("Sum:" + mathutils.multiply(12,12));

    //Quotient
    System.out.println("Sum:" + mathutils.divide(64,8));

    //Quotient if divisor is zero
    System.out.println("Sum:" + mathutils.divide(89,0));
}
}