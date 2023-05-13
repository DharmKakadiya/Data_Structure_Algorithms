package org.dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Stream_Practice {
    public static void main(String[] args) {

        List<Book> B=new ArrayList<>();

        Author a1=new Author("Surname 1",45);
        Author a2=new Author("Surname 2",50);
        Author a3=new Author("Surname 3",40);
        Author a4=new Author("Surname 4",35);
        Author a5=new Author("Surname 5",46);
        Author a6=new Author("Surname 6",47);

        Book b1=new Book("book1", a1);
        Book b2=new Book("book2",  a2);
        Book b3=new Book("book3",  a3);
        Book b4=new Book("book4", a4);
        Book b5=new Book("book5",  a5);
        Book b6=new Book("book6",  a6);
        B.add(b1);
        B.add(b2);
        B.add(b3);
        B.add(b4);
        B.add(b5);
        B.add(b6);
        //System.out.println(B);

        B.stream().map(b -> b.getAuthor())
                .filter(a -> a.getAge() > 40)
                .limit(3)
                //.map(a -> a.getSurname().toUpperCase())
                .forEach(a-> System.out.println( a.getSurname().toUpperCase()  +a.getAge()));

        //collect.stream().sorted().forEach(p-> System.out.println(p));
    }
}
