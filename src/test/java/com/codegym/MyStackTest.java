package com.codegym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MyStackTest {
    @Test
    void stackIsEmptyTest() {
        MyStack myStack = new MyStack(1);
        assertTrue(myStack.stackIsEmpty());
    }

    @Test
    void pushTest() {
        MyStack myStack = new MyStack(1);
        assertEquals(99, myStack.push(99));
    }

    @Test
    void popTest() {
        MyStack myStack = new MyStack(1);
        myStack.push(99);
        assertEquals(99, myStack.pop());
    }

}