package org.dsa;


import java.sql.SQLOutput;

class A{
     int x=10;

    public void display() {
        System.out.println("mirav");
    }
}
class b extends A{
    public void display(){
        System.out.println("dharm");
        System.out.println();
    }
    b(){
        super();
        System.out.println(super.x);
    }
}
public class Main {

    public static void main(String[] args) {

        A obj=new b();
        obj.display();
        System.out.println(obj.x);
        System.out.println("Hello world!");
    }
}