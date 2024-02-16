/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labactivity2_meñosa;

import java.util.Scanner;
public class Labactivity2_Meñosa {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.print("Enter the message: ");
        String msg = input.nextLine();
        
        String[] word = msg.split("\\s+");
        
        for(String words : word){
            for(int i = 1; i < words.length(); i++){
                if(Character.isUpperCase(words.charAt(i))){
                    System.out.print("JEJE!");
                }
                else{
                    System.out.print("uWu");
                }
            }
        }
    }
    
}
