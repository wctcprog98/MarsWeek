import java.util.InputMismatchException;
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
//        int userGuess = sc.nextInt();
        int number = rand.nextInt(100);
        int count = 0;

        //check condition
        while(true) {
        int userGuess;
        try {
            userGuess = sc.nextInt();
        } catch (InputMismatchException e) {
            String wrongInput = sc.next(); //clears bad input
            System.out.println(name + " your guess was not a number, please try again ");
            continue;
        }
        //check if out of bounds
            if(userGuess < 1 || userGuess > 100) {
                System.out.println(name + " your guess was not between 1-100, please pick a number " +
                        "between 1-100 and try again ");
                        continue;
            }
             //add one to whatever current count is
                count += 1;
            //game logic
            if(userGuess > number) {

                System.out.println("Sorry " + name + " your guess was too high, try again");
            } else if (userGuess < number) {

                System.out.println(name + ", sorry your guess was too low please try again");
            }
             else {
                System.out.println(name + ", your guess was spot on, you guessed my number in " + count + " guesses!");
                break;
            }

            }
        }
}
