cpackage org.example;

public class Calculator {
    import static java.lang.Math.sqrt;
    public double squareRoot(double number) {
        return sqrt(number) ;

    }
    public double divide(double number1, double number2) {
        double result ;
        if (number2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        result = number1/number2 ;
        return result;
    }


}
