package com.atakankosdurma.abstractx;


import java.util.Date;

public class Teacher extends Person {


    public Teacher() {

    }

    public void govdesizMethod(){
        System.out.println("teacher govdesiz method");
    }

    public Teacher(Long id, String name, String surname, Date createdDate) {
        super(id, name, surname, createdDate);
    }

    @Override
    public String create() {
        return "";
    }

    @Override
    public String select() {
        return "select * from [Northwind].[dbo].[Teacher]where id between 3 and 5 order by desc";
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
