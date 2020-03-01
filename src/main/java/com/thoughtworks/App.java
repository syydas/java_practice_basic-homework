package com.thoughtworks;

import java.text.ParseException;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws ParseException {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("张三", "001", "2019.02.11"));
        students.add(new Student("李四", "002", "2019.02.10"));
        students.add(new Student("王五", "003", "2019.02.09"));
        students.add(new Student("张三", "001", "2019.02.11"));

        System.out.println("Students' info:");
        for (Student student : students) {
            System.out.println(student);
        }

        Teacher teacher = new Teacher("张龙", students);
        ArrayList<Student> repeatStu = teacher.checkInfo();
        if (repeatStu.size() != 0) {
            System.out.println("Repeat students' info: ");
            for (Student student : repeatStu) {
                System.out.println(student);
            }
        } else {
            System.out.println("no repeat student");
        }
    }
}
