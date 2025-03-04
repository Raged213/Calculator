import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        welcomeMesseg();
        calC();
    }
    public static void lineBreak(){
        System.out.println("--------------------------------");
    }

    public static void welcomeMesseg(){
        System.out.println("Welcome to the Calculator, hope i did it right! :D ");
        lineBreak();
    }

    public static void calC(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pls type your first number!: ");
        double userInput1 = scanner.nextDouble();
        System.out.print("Pls type your Type of Calculation");
        char c = scanner.next().charAt(0);
        System.out.print("And lastly your last number");
        double userInput3 = scanner.nextDouble();

        Calculator calc = new Calculator(userInput1, userInput3, c);

        double result = calc.calculator();
        System.out.println("Resultatet er: " + result);
    }
}
