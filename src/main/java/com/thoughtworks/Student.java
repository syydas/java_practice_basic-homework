package com.thoughtworks;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private String id;
    private Date enrollmentDate;

    public Student() {
    }

    public Student(String name, String id, String enrollmentDate) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.DD");
        this.name = name;
        this.id = id;
        this.enrollmentDate = simpleDateFormat.parse(enrollmentDate);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月DD日");
        return "我叫" + name + "，我的学号是" + id + simpleDateFormat.format(enrollmentDate) + "入学，学龄" + getSchoolAge() + "年";
    }

    public int getSchoolAge() {
        Date cur = new Date();
        SimpleDateFormat simpleYear = new SimpleDateFormat("yyyy");
        return Integer.parseInt(simpleYear.format(cur)) - Integer.parseInt(simpleYear.format(enrollmentDate));
    }
}
