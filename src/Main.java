import Data.Calculator;

public class Main {
    public static void main(String[] args) {

        Calculator calculator1 = new Calculator(5,5);

        System.out.println("The sum result is: " + calculator1.getAdd());
        System.out.println("The subtract result is: " + calculator1.getSubtract());
    }

}
