import models.Stack;

/**
 * StackApp
 */
public class StackApp {
    public static void main(String[] args) {
        // Stack stackOne = new Stack(5);
        // Stack stackTwo = new Stack(5);
        // Stack stackThree = new Stack(5);

        // int i = 5; while(!stackOne.isStackFilled()) stackOne.push(i++);
        // int j = 9; while(!stackThree.isStackFilled()) stackThree.push(j--);

        // System.out.println("Stack 1 (before): " + stackOne);
        // int operations = stackOne.moveTo(stackTwo);

        // System.out.print("\n");
        // System.out.println("Stack 1 (after): " + stackOne);
        // System.out.println("Stack 2 (destination): " + stackTwo);

        // System.out.print("\n");
        // System.out.println("Transferred: " + operations + " items.");

        // System.out.print("\n");
        // System.out.println("Stack 3 (new): " + stackThree);
        // System.out.println("Stack 2 == Stack 3 ? " + stackTwo.equals(stackThree));

        int number =  Integer.parseInt(System.console().readLine("Enter a positive Integer: "));
        if (number <= 0) {
            System.out.println("Invalid input. Exiting...");
        } else {
            System.out.println(toBinaryStack(number));
        }
    }

    public static Stack toBinaryStack(int number) {
        Stack result = new Stack(32);

        for (int i = 31; i >= 0; i--) {
            int mask = 1 << i;
            result.push((number & mask) != 0 ? 1 : 0);
        }

        return result;
    }
}
