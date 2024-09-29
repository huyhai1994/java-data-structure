package com.codegym.binary_tree;

public class BinaryTree {
    Node root;

    public void addNode(int key, String name) {
        Node newNode = new Node(key, name);
        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root;
            Node parent;
            while (true) {
                parent = focusNode;
                if (key < focusNode.key) {
                    focusNode = focusNode.leftChild;
                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.rightChild;
                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

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
