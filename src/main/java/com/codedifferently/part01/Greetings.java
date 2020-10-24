package com.codedifferently.part01;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args){
        //we created a scanner object to collect input from user.
          Scanner scanner = new Scanner(System.in);
        //we used system out println to give feedback to the user
          System.out.println("What's your name?: ");
          String input = scanner.next();
          System.out.println("Seems like you entered your name as " +input);
        //TO DO if the user's name is Hakim or Rasheeda, say "hello"
         if (input.equalsIgnoreCase("Hakim") || input.equalsIgnoreCase("Rasheeda")
            ){ 
              System.out.println("Why hello there! I know you! Welcome Back! :-) ");
             }
        //TO DO if the user's name is not Hakim or Rasheeda, say "IDK yuh Bruv"
             else {
                 System.out.println("It was nice to meet you, but IDK yuh Bruv. Buh-Bye!!!");
             }

       
        
    }

  
}
