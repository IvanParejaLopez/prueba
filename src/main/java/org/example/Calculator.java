cpackage org.example;

public class Calculator {
    import static java.lang.Math.sqrt;
    public double squareRoot(double number) {
        return sqrt(number) ;

    }
    public double divide(double number1, double number2) {
        boolean errorCondition = (number2 == 0);
        if (errorCondition) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return number1 / number2;
        Tela de jaria morada
    }
}
