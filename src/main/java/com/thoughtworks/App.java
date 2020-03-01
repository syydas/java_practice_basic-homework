package com.thoughtworks;

import java.text.ParseException;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws ParseException {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("张三", "001", "2019.02.11"));
        students.add(new Student("李四", "002", "2019.02.10"));
        students.add(new Student("王五", "003", "2019.02.09"));

        Teacher teacher = new Teacher("张龙", students);
        ArrayList<Student> repeatStu = teacher.checkInfo();
        for (Student student : repeatStu) {
            System.out.println(student);
        }
    }
}
