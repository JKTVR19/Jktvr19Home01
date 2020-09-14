/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktvr19myarray;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Juri
 */
public class AppF {
  public void run() {
        //
        System.out.println("\nЗадание 1. Цельсий в Фаренгейт");
        System.out.print("Введите температуру: ");
        String enteredString;/**/
        double celsTemp, fareTemp;
        Scanner scanner = new Scanner(System.in);
        enteredString = scanner.nextLine();/**/
        celsTemp = Integer.parseInt(enteredString);
        
        fareTemp = celsTemp * 9/5 + 32;
        
        System.out.println("Температура: " + celsTemp);
        System.out.println("Фаренгейты: " + fareTemp);

        //
        int number, s, d, c;
        
        System.out.println("\nЗадание 2. Единицы и десятки");
        System.out.print("Введите трехзначное число: ");
        enteredString = scanner.nextLine();
        number = Integer.parseInt(enteredString);
        
        s = number / 10 / 10;
        c = number % 10;
        d = (number - ((s * 100) + c)) / 10;
        
        System.out.println("Ваше число: " + enteredString);
        System.out.println("Сотни: " + s);
        System.out.println("Десятки: " + d);
        System.out.println("Единицы: " + c);
        
        //
        int startYear = 1984;
        int year = 0;
        int year12 = 0;
        
        System.out.println("\nЗадание 3. Восточный календарь");
        System.out.print("Введите год(****): ");
        enteredString = scanner.nextLine();
        year = Integer.parseInt(enteredString);
        if (year < startYear) {
            while(year < startYear) {
                year += 60;
            }
        }
        year = year % startYear;
        year12 = (year % 60) / 12;// 2100 - 1984 = 116 % 60 = 56 / 12 = 
        
        System.out.print("Подцикл: ");
        if (year12 == 0) {
            System.out.print("Зеленый");
        } else if (year12 == 1) {
            System.out.print("Красный");
        } else if (year12 == 2) {
            System.out.print("Желтый");
        } else if (year12 == 3) {
            System.out.print("Белый");
        } else if (year12 == 4) {
            System.out.print("Черный");
        }
        System.out.print("\nНазвание года: ");
        switch (year % 12) {
            case 0:
                System.out.print("Крыса");
            break;
            case 1:
                System.out.print("Корова");
            break;
            case 2:
                System.out.print("Тигр");
            break;
            case 3:
                System.out.print("Заяц");
            break;
            case 4:
                System.out.print("Дракон");
            break;
            case 5:
                System.out.print("Змея");
            break;
            case 6:
                System.out.print("Лошадь");
            break;
            case 7:
                System.out.print("Овца");
            break;
            case 8:
                System.out.print("Обезьяна");
            break;
            case 9:
                System.out.print("Курица");
            break;
            case 10:
                System.out.print("Собака");
            break;
            case 11:
                System.out.print("Свинья");
            break;
            default:
                System.out.print(year % 12);
            break;
            
        }
        
        System.out.println("\nЗадание 4. Таблица умножения");
        Random rand = new Random();
        int firstNumber, secondNumber, result, attempt, answer, hind = 0;
        
        attempt = 5;
        
        while (attempt > 0) {
            firstNumber = rand.nextInt(9 - 1 + 1) + 1;
            secondNumber = rand.nextInt(9 - 1 + 1) + 1;
            System.out.print(firstNumber + " * " + secondNumber + " = ");
            result = firstNumber * secondNumber;
            enteredString = scanner.nextLine();
            answer = Integer.parseInt(enteredString);
            if (answer == result) {
                System.out.println("Правильно!");
                hind += 1;
            }
            attempt -= 1;
        }
        
        switch (hind) {
            case 5:
                System.out.println("Молодец, " + hind);
            break;
            case 4:
                System.out.println("Надо ещё поучить, " + hind);
            break;
            case 3:
                System.out.println("Надо ещё поучить, " + hind);
            break;
            default:
                System.out.println("Срочно учить таблицу умножения!");
            break;
        }
        
        
        
    }
}
