package com.codegym;

public class MyStack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public MyStack(int size) {
        maxSize = size;
        top = -1;
        stackArray = new int[maxSize];
    }

    public boolean stackIsEmpty() {
        return this.top == -1;
    }

    public int push(int data) {
        stackArray[++top] = data;
        return stackArray[top];
    }

    public int pop() {
        if (stackIsEmpty()) throw new RuntimeException("underflow");
        top = top - 1;
        return stackArray[top + 1];
    }

}
