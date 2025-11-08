package org.danil.test.college.people;

import org.danil.test.college.food.Food;

public class Student {

    private Integer age;
    private String name;
    private String course;
    private Integer hungryLevel;
    private Sex sex;
    private Integer money;
    private Status status;
    private Food food;

    public Student(Integer age, String name, String course, Integer hungryLevel, Sex sex, Integer money ) {
        this.age = age;
        this.name = name;
        this.course = course;
        this.hungryLevel = hungryLevel;
        this.sex = sex;
        this.money = money;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public void xavaet(Food food){
       this.food=food;
        if(money> food.getPrice()){
            hungryLevel+=food.getCalories();
            money-=food.getPrice();
            status=Status.KOROL;
        }
        else{
            status=Status.LOH;
        }

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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Integer getHungryLevel() {
        return hungryLevel;
    }

    public void setHungryLevel(Integer hungryLevel) {
        this.hungryLevel = hungryLevel;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        if(food != null) {
            return "Студент{ \n" +
                    " Возраст = " + age + "\n" +
                    " Имя = " + name + "\n" +
                    " Курс = " + course + "\n" +
                    " Уровень голода = " + hungryLevel + "\n" +
                    " Деньги = " + money + "\n" +
                    " Пол = " + sex + "\n" +
                    " Статус = " + status + "\n" +
                    " Еда = " + food.toString() + "\n" +
                    '}';
        }
        else {
            return "Студент{ \n" +
                    " Возраст = " + age + "\n" +
                    " Имя = " + name + "\n" +
                    " Курс = " + course + "\n" +
                    " Уровень голода = " + hungryLevel + "\n" +
                    " Деньги = " + money + "\n" +
                    " Пол = " + sex + "\n" +
                    " Статус = " + status + "\n" +
                    '}';
        }
    }

}
