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
        }
        else {
            System.out.println("Too bad you aren't a team leader. You have to go.");
        }

        //greet user and ask if they wanna play w y/n
        //save input
        //if no, send message
        //if yes continue
        //ask user how many people are on their team

    }
}
