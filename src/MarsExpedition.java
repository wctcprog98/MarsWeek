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
        System.out.println(" ---------------------");
        System.out.print("Hi," + name + " Welcome to the Expediton prep program. Are you ready to head out into the new world? Type Y or N? ");
        String input = sc.nextLine();

        //check condition
        if(input.equalsIgnoreCase("Y")) {
            System.out.println(" ---------------------");
            System.out.println(name + " I knew you would say that. You are a team leader for a reason!");
            System.out.println(" ---------------------");
            System.out.println("How many people would like on your team?");

        }
        else {
            System.out.println("Too bad you aren't a team leader. You have to go.");
        }
        //ask user how many people are on their team
        int teamSize = sc.nextInt();
        System.out.println(teamSize);


            if (teamSize > 3) {
                System.out.println(" ---------------------");
                System.out.println("That's way too many people. We can only send 3 total members");
                teamSize = 3;
            } else if (teamSize < 3) {
                System.out.println(" ---------------------");
                System.out.println("That's not enough people to play, we need a team of 3 total members");
                teamSize = 3;
            } else if (teamSize == 3) {
                System.out.println(" ---------------------");
                System.out.println("That's a perfect sized team. Good job");
            }

        sc.nextLine();
        //tell user they are logged on and they one snack
        System.out.println(" ---------------------");
        System.out.println(name + ", you are allowed to bring one snack. What would you like to bring?");
        System.out.println(" ---------------------");
        String snack = sc.nextLine();
        System.out.println("Nice choice " + name + ", you will be bringing a " + snack + " with you.");
        System.out.println(" ---------------------");

        System.out.println("You have the choice of 3 vehicles" +
                "\nA: A Mars Rover" +
                "\nB: A Chevy Silverado" +
                "\nC: A Honda Civic");
        System.out.println(" ---------------------");
        System.out.println("What would you like to drive?");
        System.out.println(" ---------------------");
        String  choice = sc.nextLine().toUpperCase();
        String vehicle = "A lexus";

        switch(choice) {
            case "A":
                vehicle = "A Mars Rover";
                break;
            case "B":
                vehicle = "A Chevy Silverado";
                break;
            case "C":
                vehicle = "A Honda Civic";
                break;
            default:
                System.out.println("You did not choose from the available options, try again");
        }
        System.out.println(" ---------------------");
        System.out.println("Your expedition is ready to explore" +
                "\nLed by " + name + " you have a " + teamSize + " person team."
                + " You are bringing a " + snack + " with you" +
                "\nYou will be exploring mars in a " + vehicle +
                "\nTeam leaves in" +
                "\n5..." +
                "\n4..." +
                        "\n3..." +
                        "\n2..." +
                        "\n1..." +
                        "\nGO and Godspeed"
                );
    }

}
