package com.student.ms.studentModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String name;
    private String mobile;
    private double salary;

    public StudentEntity(String baski, String number, int i) {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

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

    public StudentEntity() {
    }

    public StudentEntity(int id, String name, String mobile, double salary) {
        Id = id;
        this.name = name;
        this.mobile = mobile;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", salary=" + salary +
                '}';
    }

}
