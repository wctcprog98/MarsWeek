import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public GuessingGame() {
        System.out.println("Hello there, what's your name?");
        System.out.print("Please type in your name : ");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        //test
        System.out.println(name);
        Random rand = new Random();
        //create instance
        int number = sc.nextInt(100);
        //call method nextInt and pass


    }
}
