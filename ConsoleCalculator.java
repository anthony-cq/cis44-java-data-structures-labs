import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {
        double currentTotal = 0.0;
        double nextValue = 0.0;
        String pendingOperator = "";
        boolean isOperating = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("---TRY ME: CONSOLE CALCULATOR---");
        System.out.println("Enter a number, an operator, or type 'exit' to quit.");
        System.out.println("Current result: " + nextValue);

        while (true) {
            String input = scanner.nextLine().trim();

            if (input.equals("exit")) {
                System.out.println("Thanks for using!");
                break;
            }
            if (input.isEmpty()) {
                continue;
            }
            if (input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/") || input.equals("=")) {
                if (!pendingOperator.equals("") && !isOperating) {

                    if (pendingOperator.equals("+"))
                        currentTotal += nextValue;
                    else if (pendingOperator.equals("-"))
                        currentTotal -= nextValue;
                    else if (pendingOperator.equals("*"))
                        currentTotal *= nextValue;
                    else if (pendingOperator.equals("/")) {
                        if (nextValue == 0) {
                            System.out.print("Cannot divide by zero");
                            currentTotal = 0;
                        } else {
                            currentTotal /= nextValue;
                        }
                    }
                    nextValue = currentTotal;
                } else if (pendingOperator.equals("")) {
                    currentTotal = nextValue;
                }
                if (input.equals("=")) {
                    pendingOperator = "";
                } else {

                    pendingOperator = input;
                }
                isOperating = true;
                System.out.println("Current result: " + nextValue);

            } else {
                    double newNumber = Double.parseDouble(input);
                    if (isOperating || pendingOperator.equals("")) {
                        nextValue = newNumber;
                        isOperating = false;

                    } else {
                        nextValue = newNumber;
                    }
                    System.out.println("Current result: " + nextValue);


                }

            }

            scanner.close();
    }
}