package com.atakankosdurma.abstractx;


import java.util.Date;

public class Student extends Person {



    private String specialStudent;

    public Student(){

    }

    public Student(Long id, String name, String surname, Date createdDate, String specialStudent) {
        super(id, name, surname, createdDate);
        this.specialStudent = specialStudent;
    }

    public void govdesizMethod(){
        System.out.println("student govdesiz method");
    }

    public String getSpecialStudent() {
        return specialStudent;
    }

    public void setSpecialStudent(String specialStudent) {
        this.specialStudent = specialStudent;
    }

    @Override
    public String create() {
        return "";
    }

    @Override
    public String select() {
        return "";
    }

    @Override
    public String update() {
        return "";
    }

    @Override
    public String delete() {
        return "";
    }
}
