package org.example.day6;

public class StudentCollection {
    static void Meha(){
        Student meha=new Student();
        meha.name="Meha.R.K";
        meha.age=22;
        meha.department="CSE";
        System.out.println("Name: "+meha.name+" Age: "+meha.age+" Department: "+meha.department);
    }
    static void Pragathi(){
        Student pragathi=new Student();
        pragathi.name="Pragathi.V";
        pragathi.age=22;
        pragathi.department="CSE";
        System.out.println("Name: "+pragathi.name+" Age: "+pragathi.age+" Department: "+pragathi.department);
    }
    static void Suvadha(){
        Student suvadha=new Student();
        suvadha.name="Suvadha.M";
        suvadha.age=23;
        suvadha.department="ECE";
        System.out.println("Name: "+suvadha.name+" Age: "+suvadha.age+" Department: "+suvadha.department);
    }
    public static void main(String args[]){
        Meha();
        Pragathi();
        Suvadha();
    }
}
