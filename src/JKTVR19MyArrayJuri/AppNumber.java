/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JKTVR19MyArrayJuri;

import java.util.Scanner;

/**
 *
 * @author Juri
 */
public class AppNumber {
        public void run() {
        System.out.println("\nПользователь вводит трехзначное число. Найдите:\nЧисло единиц, десятков.\nСумму цифр\n\nДля решения можно использовать арифметический оператор % - остаток от деления");
        System.out.print("Введите трехзначное число: ");
        
        int  hundrs, tens, units, summa;
        
        Scanner scanner = new Scanner(System.in);/*считываем с входящего потока*/
        int number1 = scanner.nextInt(); /*раскомментировать при запуске*/
        
        /*s = number / 10 / 10;
        c = number % 10;
        d = (number - ((s * 100) + c)) / 10;*/
        
        hundrs = number1/100;
        
        /*tens = (number1-hundrs*100) / 10;*/
        tens = number1 % 100/10;
        
        /*units = number1 - ((hundrs * 100) + tens * 10);*/
        units = number1 % 10;
        
        summa = hundrs + tens + units;
                
        System.out.println("");
        System.out.println("Введённое число: " + number1);
        System.out.println("");
        
        System.out.println("Сотен в введённом числе: " + hundrs);
        System.out.println("Десятков в введённом числе: " + tens);
        System.out.println("Единиц в введённом числе: " + units);
        System.out.println("Сумма цифр: " + summa);
        
    }
}
    

