package org.dsa.Stack;

public class Stack {

    public static void main(String[] args) {

        Stack myStack = new Stack(4);
        //myStack.printAll();
        myStack.push(5);

        myStack.printStack();

        myStack.pop();
//        System.out.println("======= after pop=======");
//        myStack.printStack();


        /*
            EXPECTED OUTPUT:
            ----------------
            Top: 4
            Height: 1

            Stack:
            4

        */

    }


    private Node top;
    private int height;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }
    }

    public Stack(int value){
        Node newNode=new Node(value);
        top=newNode;
        height=1;
    }

    public Node getTop() {
        return top;
    }

    public int getHeight() {
        return height;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (height == 0) {
            System.out.println("Top: null");
        } else {
            System.out.println("Top: " + top.value);
        }
        System.out.println("Height:" + height);
        System.out.println("\nStack:");
        if (height == 0) {
            System.out.println("empty");
        } else {
            printStack();
        }
    }

    public void push(int value){
        Node newNode = new Node(value);
        if(height==0){
            top=newNode;

        }else {

            newNode.next = top;
            top = newNode;

        }
        height++;
    }

    public void pop(){
        if(height==0){
            System.out.println("the Stack is empty");
        }
        else{
            Node temp=top;
            top=top.next;
            temp.next=null;
            height--;
        }
    }
    public void makeEmpty() {
        top = null;
        height = 0;
    }

}


