package com.codegym.binary_tree;

public class BinaryTree {
    public static void main(String[] args) {

    }
}

class Node {
    int key;
    String name;
    Node leftChild, rightChild;

    Node(int item, String name) {
        key = item;
        this.name = name;
        leftChild = rightChild = null;
    }

    public String toString() {
        return "(" + key + ", " + name + ")";
    }

}
