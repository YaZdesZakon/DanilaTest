package org.danil.test;

import java.util.Scanner;

public class MainClass {

    /*
    Дописать программу чтобы она говорила кому нельзя пить алкоголь
     */

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя : ");
        String name = scanner.next();
        System.out.println("Введите возраст : ");
        int age = scanner.nextInt();

        if(age > 18){
            System.out.println("Тебе можно пить бухлишко : "+ name);
        }
        else  {
            System.out.println("Тебе нельзя пить бухлишко : "+ name);
        }

    }

}
