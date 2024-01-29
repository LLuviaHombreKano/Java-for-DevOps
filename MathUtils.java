public class MathUtils
{

    //Method for adding two variables
    int add (int a, int b){
        return a + b;
    }

    //Method for subtracting two variables
    int subtract (int a, int b){
        return a - b;
    }

    //Method for multiplying two variables
    int multiply (int a, int b){
        return a * b;
    }

    //Method for dividing two variables
    double divide (int a, int b){
        if (b == 0) {
            return -1.0;
        }

        return (double) a + b;
    }
}