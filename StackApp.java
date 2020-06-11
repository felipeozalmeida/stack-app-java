import models.Stack;

/**
 * StackApp
 */
public class StackApp {
    public static void main(String[] args) {
        Stack myStack = new Stack(5);
        int i = 5;
        while(!myStack.isStackFilled()) myStack.push(i++);
        System.out.println(myStack);

        Stack newStack = new Stack(5);
        System.out.println(myStack.moveTo(newStack));
        System.out.println(myStack);
        System.out.println(newStack);
    }
}
