package com.atakankosdurma.abstractx;

import com.atakankosdurma.interfacex.ICrud;

import java.util.Date;

public abstract class Person implements ICrud {

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }

    public void govdeliMethod(){
        System.out.println("name: "+name+" Surname: "+surname);
    }

    //bir class gövdesiz method olmayabilir
    //gövdesiz değilse abstarct yazmayabilirsiniz
    public abstract void govdesizMethod();


    private Long id;
    private String name;
    private String surname;

    public Person(Long id, String name, String surname, Date createdDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.createdDate = createdDate;
    }

    private Date createdDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

}
