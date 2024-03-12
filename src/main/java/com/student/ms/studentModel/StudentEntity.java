package com.student.ms.studentModel;

import jakarta.persistence.Entity;

@Entity
public class StudentEntity {
    private String name;
    private String mobile;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public StudentEntity(String name, String mobile, double salary) {
        this.name = name;
        this.mobile = mobile;
        this.salary = salary;
    }

    public StudentEntity() {
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", salary=" + salary +
                '}';
    }
}
