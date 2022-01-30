import java.util.*;

/**
 * A simple integer calculator
 */
class SimpleCalculator {

    public static void main(String[] args) {

        System.out.println("\n\nWelcome to the simple integer calculator!");
        System.out.println("Supported operators: + - * /");
        System.out.println("Must be integers and in the form like a + b.");
        System.out.println("TO EXIT, type 'exit'\n\n");

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("> ");

            String expression = sc.nextLine();
            String[] expArr = expression.split(" ", 0); // Expression MUST have spaces!

            if(expression.toLowerCase().equals("exit"))
                break;

            if(expArr.length != 3) {
                System.out.println("> Unknown expression, must be in form like: a + b");
            } else {

                if(expArr[1].equals("+")) {
                    System.out.println(">>> " + addition(Integer.parseInt(expArr[0]), Integer.parseInt(expArr[2])));

                } else if (expArr[1].equals("-")) {
                    System.out.println(">>> " + subtraction(Integer.parseInt(expArr[0]), Integer.parseInt(expArr[2])));
                    
                } else if (expArr[1].equals("*")) {
                    System.out.println(">>> " + multiply(Integer.parseInt(expArr[0]), Integer.parseInt(expArr[2])));

                } else if (expArr[1].equals("/")) {
                    System.out.println(">>> " + divide(Integer.parseInt(expArr[0]), Integer.parseInt(expArr[2])));

                } else {
                    System.out.println(">>> Unknown operator, allowed operators: + - * /");
                };

            }
        }

        sc.close();

    }

    static int addition(int a, int b) {
        return a + b;
    }

    static int subtraction(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        return a / b;
    }
}