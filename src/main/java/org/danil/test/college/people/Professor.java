package org.danil.test.college.people;

public class Professor {
    Integer age;
    String name;
    String faculty;
    Integer hungryLevel;

    public Professor(Integer age, String name, String faculty, Integer hungryLevel) {
        this.age = age;
        this.name = name;
        this.faculty = faculty;
        this.hungryLevel = hungryLevel;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }


}
