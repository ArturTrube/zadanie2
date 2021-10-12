/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Zadanie2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Имя человека:   ");
        String Name = scanner.nextLine();
        
        System.out.println("Фамилия человека:   ");
        String Lastname = scanner.nextLine();
        
        System.out.println("День рождения:  ");
        int Day = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.println("Месяц рождения словом:   ");
        String Month = scanner.nextLine();
        
        System.out.println("Год рождения:   ");
        int Year = scanner.nextInt();
        
        System.out.println(Name + "" + Lastname + " Родился " + Day + " " + Month + " " + Year);
        
        
    }
    
}
