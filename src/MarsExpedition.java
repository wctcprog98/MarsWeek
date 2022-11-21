import java.util.InputMismatchException;
import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Expedition game preparing to start");
        System.out.println("System loading");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Ready...");

        System.out.println("Hello what's your name?");
        String name = sc.nextLine();
        System.out.print("Hi," + name + " Welcome to the Expediton prep program. Are you ready to head out into the new world? Type Y or N? ");
        String input = sc.nextLine();

        //check condition
        if(input.equalsIgnoreCase("Y")) {
            System.out.println(name + " I knew you would say that. You are a team leader for a reason!");
            System.out.println("How many people would like on your team?");

        }
        else {
            System.out.println("Too bad you aren't a team leader. You have to go.");
        }
        //ask user how many people are on their team
        int teamSize = sc.nextInt();
        System.out.println(teamSize);


            if (teamSize > 3) {
                System.out.println("That's way too many people. We can only send 3 total members");
                teamSize = 3;
            } else if (teamSize < 3) {
                System.out.println("That's not enough people to play, we need a team of 3 total members");
                teamSize = 3;
            } else if (teamSize == 3) {
                System.out.println("That's a perfect sized team. Good job");
            }

        sc.nextLine();
        //tell user they are logged on and they one snack
        System.out.println(name + ", you are allowed to bring one snack. What would you like to bring?");
        String snack = sc.nextLine();
        System.out.println("Nice choice " + name + ", you will be bringing a " + snack + " with you.");
        //
    }
}
