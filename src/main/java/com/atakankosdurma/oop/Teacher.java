package com.atakankosdurma.oop;

import java.util.Date;
import java.util.Objects;

public class Teacher {

    private Long id;
    private String teacherName;
    private String teacherSurname;
    private Date createdDate;

    //POJO
    //POJO + Constructor
    public Teacher(){
        id=0L;
        this.teacherName="Adınızı girmediniz";
        this.teacherSurname="Soyadınızı girmediniz";
        createdDate= new Date(System.currentTimeMillis());
    }

    @Override
    public String toString() {
        return "teacher{" +
                "teacherId=" + id +
                ", teacherName='" + teacherName + '\'' +
                ", teacherSurname='" + teacherSurname + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, teacherName, teacherSurname, createdDate);
    }

    public String fullName(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(id).append(" ").append(teacherName).append(" ").append(this.teacherSurname);
        String change=stringBuilder.toString();
        return change;
    }

    public Teacher(Long teacherId, String teacherName, String teacherSurname){
        this.teacherSurname = teacherSurname;
        this.id = teacherId;
        this.teacherName = teacherName;
    }

    public Long getTeacherId() {
        return id;
    }

    public void setId(Long teacherId) {
        this.id = teacherId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getTeacherSurname() {
        return teacherSurname;
    }

    public void setTeacherSurname(String teacherSurname) {
        this.teacherSurname = teacherSurname;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

}
