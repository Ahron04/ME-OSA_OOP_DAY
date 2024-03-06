/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import encapsulation.encapsulationTest;
import java.util.Scanner;

public class student {
    
        Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        encapsulationTest e1 = new encapsulationTest();
        
        System.out.print("Enter a test case number: ");
        int testCase = scanner.nextInt();
        scanner.nextLine();
        
        switch(testCase)
        {
            case 1->
            {
                e1 = new encapsulationTest("Maranga", "Jemer Jude",17);
                System.out.println("Test Case 1: Student under 18");
                System.out.println(e1.toString);
                
            }
            case 2 -> 
            { e1 = new encapsulationTest("Maranga", "Jemer Jude",17);
              System.out.println("Test Case 2: Increase age of student");
              e1.increment();
            }
            case 3 ->
            {
                e1 =  new encapsulationTest("Maranga", "Jemer Jude",17);
                System.out.println("Test Case 3: Test Case 3: Student over 18");
                System.out.println(e1.toString());
            }           
    } 
  }
}