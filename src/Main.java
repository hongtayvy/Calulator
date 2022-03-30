import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int numberOne = Integer.parseInt(promptUser("What number would you like to add together?: "));
        int numberTwo = Integer.parseInt(promptUser("What number would you like to add together?: "));
        switch (promptUser("What operation would you like to do? (add, subtract, multiply, or divide): ")) {
            case "add" -> System.out.println("The two numbers added together is now: " + CalculatorOperations.addLogic(numberOne, numberTwo));
            case "subtract" -> System.out.println("The two numbers added together is now: " + CalculatorOperations.subtractLogic(numberOne, numberTwo));
            case "multiply" -> System.out.println("The two numbers added together is now: " + CalculatorOperations.multiplyLogic(numberOne, numberTwo));
            case "divide" -> System.out.println("The two numbers added together is now: " + CalculatorOperations.divideLogic(numberOne, numberTwo));
            default -> System.out.println("No operation was chosen for " + numberOne + " and " + numberTwo);
        }
    }

    public static String promptUser(String question){
        System.out.print(question);
        Scanner stdIn = new Scanner(System.in);
        return stdIn.nextLine();
    }
}
