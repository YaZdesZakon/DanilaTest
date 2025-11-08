package org.danil.test;

import org.danil.test.college.StudentFactory;
import org.danil.test.college.food.FoodFactory;
import org.danil.test.college.people.Sex;
import org.danil.test.college.people.Status;
import org.danil.test.college.people.Student;

import java.util.Random;

public class MainClass {

    private static final StudentFactory studentFactory = new StudentFactory();
    private static final Random рендом = new Random();
    private static final FoodFactory foodFactory = new FoodFactory();
    public static void main(String args[]) {

        Student[] шкаф = studentFactory.createGroup("ВМ-20", 10);

        for (int ячейкаНомер = 0; ячейкаНомер < шкаф.length; ячейкаНомер++) {
            Student student = шкаф[ячейкаНомер];
            System.out.println(student);
            if (student.getHungryLevel() < 50) {
                зашелПожрать(student);
            }
        }
        System.out.println("После еды \n\n\n");
        for (int ячейкаНомер = 0; ячейкаНомер < шкаф.length; ячейкаНомер++) {
            Student student = шкаф[ячейкаНомер];
            if (student.getStatus() != null){
                System.out.println(student);
            }
        }

    }

    public static void зашелПожрать(Student студент) {
        int vibor = рендом.nextInt(3);
        if (vibor == 1) {
            студент.xavaet(foodFactory.createBorch());

        }
        if (vibor == 0) {
            студент.xavaet(foodFactory.createKartoxa());
        }
        if (vibor == 2) {
            студент.xavaet(foodFactory.createKotleta());

        }
    }
}
