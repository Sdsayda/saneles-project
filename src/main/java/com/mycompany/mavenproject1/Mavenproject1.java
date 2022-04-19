/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template

N
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

import java.util.Scanner;
public class Mavenproject1 {

    public static void main(String[] args) {
        


    
        
        String name;
        String username;
        String password;
        
        Scanner input = new Scanner(System.in);
        
        String username_check;
        String password_check;
        
        System.out.println("Please enter your name:");
        name = input.nextLine();
        
        System.out.println("Please enter a username (it must contain an underscore and must not be more than 5 characters long ):");
        username = input.nextLine();
        
        
        
        int count = 0;
        //counts characters in the user name
        for(int i = 0; i < username.length();i++){
            if(username.charAt(i)!= ' ')
            count++;
        }
        
       if (count > 5){
           System.out.println("Invalid Username the entered username exceeds the limit of 5 characters, please try again");
             
       }
       
       else {
           System.out.println(" Username entered succesfully ");
           
           System.out.println("Please enter a valid password (password must contain a minimum of 8 characters and it must contain letters including 1 upper case letter):");
        password = input.nextLine();
        
        //confirms whether or not the password is 8 characters long
         int count2 = 0;
        //checks for the amount of characters in the password
        for(int i = 0; i < password.length();i++){
            if(password.charAt(i)!= ' ')
            count2++;
        }
        
        if(count2>7){
            //checks if the password contails an uppercase letter
           for(int i=0;i<password.length();i++){
                if(Character.isUpperCase(password.charAt(i))){
                    

                 //checks if the password contains a number
                 char[] chars = password.toCharArray();
                 for(char c : chars){
                     if(Character.isDigit(c)){
                         
                         System.out.println(" Password entered succesfully ");
                         
                         
                         System.out.println("*********");
                         
                         System.out.println("Please enter username: ");
                         username_check = input.nextLine();
                         System.out.println("Please enter password: ");
                         password_check = input.nextLine();
                         
                         if(username_check.equals(username)){
                             if(password_check.equals(password)){
                                 System.out.println("###############");
                                 System.out.println("WELCOME! " + name);
                             }
                         }
                         
                         else {
                             System.out.println("Username or password entered is incorrect!!");
                         }
                     }
                 }
                    
                }
           }
        }
            else{
            
            System.out.println("Invalid Password , please use the proper password format");
        }
        
        }
    }
}
}
    


