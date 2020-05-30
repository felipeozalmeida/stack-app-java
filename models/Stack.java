package models;

public class Stack {
    private int top;
    private int[] data;

    public Stack() {
        data = new int[10];
    }

    public Stack(int length) {
        data = new int[length];
    }

    public boolean isStackEmpty() {
        return top == 0;
    }

    public boolean isStackFilled() {
        return top == data.length;
    }

    public int getLastElement() {
        return data[top - 1];
    }

    public void push(int element) {
        data[top++] = element;
    }

    public int pop() {
        return data[--top];
    }

    @Override
    public String toString() {
        String s = "";
        if (isStackEmpty()) s = "Empty stack.";
        else for (int i : data) s += i + " ";
        return s;
    }
}
