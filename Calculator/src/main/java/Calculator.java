import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        // instantiate Scanner class
        Scanner scanner = new Scanner(System.in);
        // create operator variable which will get assigned the operator
        String operator = null;
        // first while loop to continue if more calculations need to be done
        while(true){
            // second while loop to validate user input
            while(true){
                System.out.println("Select operator (+, -, *, /)");

                operator = scanner.nextLine();
                if(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")){
                    break;
                    }
                }
            
            System.out.println("Enter the first number: ");
            int one = Integer.valueOf(scanner.nextLine());
            System.out.println("Enter the second number: ");
            int two = Integer.valueOf(scanner.nextLine());
            
            // perform action based on the operator used
            if(operator.equals("+")) {
                System.out.println(one + " + " + two + " = " + (one + two));
            }
            if(operator.equals("-")) {
                System.out.println(one + " - " + two + " = " + (one - two));
            }
            if(operator.equals("*")) {
                System.out.println(one + " * " + two + " = " + (one * two));
            }
            if(operator.equals("/")) {
                System.out.println(one + " / " + two + " = " + (one / two));
            }
            System.out.println("Would you like to perform another operation? (Y/N)");
            String answer = scanner.nextLine();
            if (!(answer.equals("Y") || answer.equals("Yes") || answer.contains("y"))){
                break;
            }
        }
    }
            
}
