package com.student.ms.studentModel;

import jakarta.persistence.Entity;

@Entity

public class StudentEntity {
    private String name;
    private String mobile;

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

    public StudentEntity(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }

    public StudentEntity() {
    }
}
