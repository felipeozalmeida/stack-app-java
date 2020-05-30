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

        while (!myStack.isStackEmpty()) myStack.pop();
        System.out.println(myStack);
    }
}
