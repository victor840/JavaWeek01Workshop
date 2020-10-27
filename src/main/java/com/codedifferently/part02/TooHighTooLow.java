package com.codedifferently.part02;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TooHighTooLow {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
        System.out.printf("Welcome to the Guessing Game! Enter a Mystery number from 1 - 36: " );
        Integer secretNumber = 18;
        Integer userGuess;  //This is user prompt
        ArrayList<Integer> guessStorage = new ArrayList<>();
        int length = guessStorage.size();
        
        do {

            userGuess = scanner.nextInt(); 
            guessStorage.add(userGuess);
            
            System.out.println("Seems like you entered:  " +userGuess); //The game is looping until the player gets the # correct
            
          
             if(userGuess < secretNumber){
             System.out.println("Number is too low, please try again :-)");//Will prompt user input is too low
             length++; //counts user attempt
             
            }
            
           else if((userGuess > secretNumber) && (userGuess <= 36)) {
               System.out.println("Number is too high, please try again :-)"); //Will prompt user input is too high
               length++; //counts user attempt
           }
           else if(userGuess > 36){
               System.out.println("Please enter a number between 1 - 36: "); //Will prompt user to enter numbers between 1 & 36
               length++; //counts user attempt

           }



        }while (userGuess !=secretNumber);{
              
                System.out.println("Yay you got it!!! :D"); //Promtps user of success
                System.out.println("Total number of attempts: " +length); //Gives total number of attempts

        }
        
      }      
 }
 
        
        
  


    