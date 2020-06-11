import models.Stack;

/**
 * StackApp
 */
public class StackApp {
    public static void main(String[] args) {
        Stack stackOne = new Stack(5);
        Stack stackTwo = new Stack(5);
        Stack stackThree = new Stack(5);

        int i = 5; while(!stackOne.isStackFilled()) stackOne.push(i++);
        int j = 9; while(!stackThree.isStackFilled()) stackThree.push(j--);

        System.out.println("Stack 1 (before): " + stackOne);
        int operations = stackOne.moveTo(stackTwo);

        System.out.print("\n");
        System.out.println("Stack 1 (after): " + stackOne);
        System.out.println("Stack 2 (destination): " + stackTwo);

        System.out.print("\n");
        System.out.println("Transferred: " + operations + " items.");

        System.out.print("\n");
        System.out.println("Stack 3 (new): " + stackThree);
        System.out.println("Stack 2 == Stack 3 ? " + stackTwo.equals(stackThree));
    }
}
