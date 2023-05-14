package org.dsa.Stream_Practice;

import java.util.*;

public class Stream_Practice {
    public static void main(String[] args) {

        List<Book> B=new ArrayList<>();

        Author a1=new Author("Surname 1",45,"m");
        Author a2=new Author("Surname 2",45,"m");
        Author a3=new Author("Surname 3",26,"f");
        Author a4=new Author("Surname 4",35,"m");
        Author a5=new Author("Surname 5",26,"f");
        Author a6=new Author("Surname 6",22,"f");

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
// ================== get age that is more than 40 and name convert into upper case pring age and surname =========
//        B.stream().map(b -> b.getAuthor())
//                .filter(a -> a.getAge() > 40)
//                .limit(3)
//                //.map(a -> a.getSurname().toUpperCase())
//                .forEach(a-> System.out.println( a.getSurname().toUpperCase()  +a.getAge()));

        //collect.stream().sorted().forEach(p-> System.out.println(p));

        // =============== count how many times ages are repeating ========================
//        Map<Integer, Long> collect = B.stream().map(b -> b.getAuthor())
//                .collect(Collectors.groupingBy(a -> a.getAge(), Collectors.counting()));
//
//         collect.entrySet().forEach(p-> System.out.println(p.getKey()+" : " + p.getValue()));

// ========= count sume of all female younger than >25 ========================
        Integer f = B.stream().map(b -> b.getAuthor())
                .filter(a -> a.getAge() > 25 && a.getGender().equals("f"))
                .map(a -> a.getAge())
                .reduce(0, Integer::sum);
        System.out.println(f);


    }
}
