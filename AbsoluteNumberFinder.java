import java.util.Scanner;

public class AbsoluteNumberFinder {

    public static int findAbsoluteValue(int number) {
        return number < 0 ? -number : number;
    }

    public static void main(String[] args) {
        System.out.print("Enter any Integer =");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int inputNumber = sc.nextInt();
            int absoluteValue = findAbsoluteValue(inputNumber);
            System.out.println("The absolute value of " + inputNumber + " is " + absoluteValue);
        } else {
            System.out.print("Enter Valid Integer");
        }
        sc.close();
    }
}
