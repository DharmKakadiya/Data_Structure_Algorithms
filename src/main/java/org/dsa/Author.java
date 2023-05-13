package org.dsa;

public class Author {
    String surname;
    int age;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public  int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Author{" +
                "surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public Author(String surname, int age) {
        this.surname = surname;
        this.age = age;
    }
}
