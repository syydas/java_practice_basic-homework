package com.thoughtworks;

import java.util.ArrayList;

public class Teacher {
    private String name;
    private ArrayList<Student> studentList;

    public Teacher(String name, ArrayList<Student> studentList) {
        this.name = name;
        this.studentList = studentList;
    }

    public Teacher() {
    }

    public ArrayList<Student> checkInfo() {
        ArrayList<Student> repeatStudent = new ArrayList<>();
        for (int i = 0; i < studentList.size(); i++) {
            for (int j = i + 1; j < studentList.size(); j++) {
                if (studentList.get(i).equals(studentList.get(j))) {
                    repeatStudent.add(studentList.get(i));
                }
            }
        }
        return repeatStudent;
    }
}
