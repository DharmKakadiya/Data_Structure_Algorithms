package org.dsa.Queue;

public class Queue {

    public static void main(String[] args) {

        Queue myQueue = new Queue(4);
//        Stack s=new Stack();
//        s.push(10);
//        s.push(4);
//        s.push(3);
//        for(int i=s.size()-1;i>=0;i--){
//            System.out.println(s.get(i));
//        }



        //myQueue.printAll();
        myQueue.enqueue(5);
        myQueue.enqueue(6);
        myQueue.printList();
        System.out.println("=========After dequeue=======");
        myQueue.dequeue();
        myQueue.printList();


        /*
            EXPECTED OUTPUT:
            ----------------
            First: 4
            Last: 4
            Length: 1

            Queue:
            4

        */

    }


    private Node first;
    private Node last;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }



    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }


    public void printAll() {
        if (length == 0) {
            System.out.println("First: null");
            System.out.println("Last: null");
        } else {
            System.out.println("First: " + first.value);
            System.out.println("Last: " + last.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nQueue:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
    public Node enqueue(int value){
        Node newNode=new Node(value);
        if(length==0){
            first=newNode;
            last=newNode;

        }
        else{
            last.next=newNode;
            last=newNode;

        }
        length++;
        return last;
    }
    public Node dequeue(){
        Node temp=first;
        if(length==0){
            System.out.println("Queue is empty");
            return null;
        } else if (length==1)
        {
                first = null;
                last = null;
                length--;
                return null;
        } else{

            first=first.next;
            temp.next=null;
            length--;
            return temp;
        }
    }

    public void makeEmpty() {
        first = null;
        last = null;
        length = 0;
    }

}
