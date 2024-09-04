package com.codegym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {

    @Test
    void testPush() {
        MyStack stack = new MyStack(5);
        assertEquals(1, stack.push(1));
        assertEquals(2, stack.push(2));
        assertEquals(3, stack.push(3));
    }

    @Test
    void testPop() {
        MyStack stack = new MyStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test
    void testStackIsEmpty() {
        MyStack stack = new MyStack(5);
        assertTrue(stack.stackIsEmpty());
        stack.push(1);
        assertFalse(stack.stackIsEmpty());
        stack.pop();
        assertTrue(stack.stackIsEmpty());
    }

    @Test
    void testUnderflow() {
        MyStack stack = new MyStack(5);
        Exception exception = assertThrows(RuntimeException.class, stack::pop);
        assertEquals("underflow", exception.getMessage());
    }
}