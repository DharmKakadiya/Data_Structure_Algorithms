package org.dsa.Stream_Practice;

public class Author {
    String surname;
    int age;
    String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

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

    public Author(String surname, int age, String gender) {
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }
}
