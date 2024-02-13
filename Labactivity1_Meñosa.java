/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labactivity1_meñosa;

import java.util.Scanner;

public class Labactivity1_Meñosa {

    static Scanner inptString = new Scanner(System.in);
     static Scanner inptInt = new Scanner(System.in);
     
    public static void main(String[] args) {
        System.out.print("Enter Full Name: ");
        String name = inptString.nextLine();
        System.out.println("Name: " + name);
        System.out.print("Enter Age: ");
        int age = inptInt.nextInt();
        System.out.println("Age: " + age);
        System.out.print("Enter Gender: ");
        String gender = inptString.nextLine();
        System.out.println("Gender: " + gender);
        System.out.print("Enter Address: ");
        String add = inptString.nextLine();
        System.out.println("Address: " + add);
        System.out.print("Civil Status: ");
        String cv = inptString.nextLine();
        System.out.println("Civil Status: " + cv);
        System.out.print("Number of Brothers/Sisters: ");
        int siblings = inptInt.nextInt();
        System.out.println("Number of Brothers/Sisters: " + siblings);
        
        
    }
    
}
