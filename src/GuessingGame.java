import com.sun.tools.javac.Main;

import java.util.Random;
import java.util.Scanner;



public class GuessingGame {

    public GuessingGame() {
        System.out.println("Hello there, what's your name?");
        System.out.print("Please type in your name : ");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        //test
        Random rand = new Random();
        //create instance
        System.out.println(name + " we're going to play a guessing name, I have a number between 1-100." + name + " " +
                        "can you guess what it is!");
        System.out.print("Try to guess my number :");
        int userGuess = sc.nextInt();
        int number = rand.nextInt(100);
        //count guesses
        //when guess = number; game over
        System.out.println(number);
        System.out.println(userGuess);
        //check condition

    }
}
