package com.atakankosdurma.oop;

import java.util.Date;
import java.util.Objects;

public class Student {

    private Long studentId;
    private String studentName;
    private String studentSurname;
    private Date createdDate;

    //POJO
    //POJO + Constructor
    public Student(){
        studentId=0L;
        this.studentName="Adınızı girmediniz";
        this.studentSurname="Soyadınızı girmediniz";
        createdDate= new Date(System.currentTimeMillis());
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, studentName, studentSurname, createdDate);
    }

    public String fullName(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(studentId).append(" ").append(studentName).append(" ").append(this.studentSurname);
        String change=stringBuilder.toString();
        return change;
    }

    public Student(Long studentId, String studentName, String studentSurname){
        this.studentSurname = studentSurname;
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

}
