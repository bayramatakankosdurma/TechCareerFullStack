package com.atakankosdurma.inheritancex;


public class MainOop {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(1L);
        student.setName("yag si");
        student.setSurname("demem");
        System.out.println(student);

        Teacher teacher = new Teacher();
        teacher.setId(2L);
        teacher.setName("yag si");
        teacher.setSurname("memd");
        System.out.println(teacher);
    }
}
