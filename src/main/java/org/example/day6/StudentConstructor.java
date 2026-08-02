package org.example.day6;

public class StudentConstructor {
    static void Student1(){
        StudentLibraryClass meha = new StudentLibraryClass("Meha", 22, "CSE");
        System.out.println("Student Name: " + meha.name);
        System.out.println("Student Age: " + meha.age);
        System.out.println("Student Branch: " + meha.department);
    }
    static void Student2(){
        StudentLibraryClass pragathi = new StudentLibraryClass("Pragathi", 22, "CSE");
        System.out.println("Student Name: "+pragathi.name);
        System.out.println("Student Age: "+pragathi.age);
        System.out.println("Student Branch: "+pragathi.department);

    }
    public static void main (String args[]){
       Student1();
       Student2();
    }
}