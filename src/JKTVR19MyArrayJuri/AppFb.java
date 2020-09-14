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
public class AppFb {
    public void run() {
    

        System.out.println("\n Дано значение температуры T в градусах Цельсия.\nОпределить значение этои же температуры по Фаренгейту. \nТемпература по Цельсию TC и температура по Фаренгейту TF \nсвязаны следующим соотношением: TC = (TF – 32)·5/9");
        System.out.print("Введите температуру: ");
        String insertTempCels; /* = null;*/
        float TC, TF;
        
        /*Scanner scanner = new Scanner(System.in);
        enteredString = scanner.nextLine();*/
        
        Scanner scanner = new Scanner(System.in);/*считываем с входящего потока*/
        insertTempCels = scanner.nextLine();
        
        TC = Integer.parseInt(insertTempCels);
        
        TF = TC * 9/5 + 32;
        
        System.out.println("\n Введённая температура в градусах Цельсия: " + TC);
        System.out.println("Соответствующая температура в градусах Фаренгейта: " + TF);
        
    }
}
