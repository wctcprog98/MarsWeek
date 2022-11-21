import java.util.*;

public class FindingsList {
    public FindingsList() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Welcome back!");

        ArrayList<String> rockList = new ArrayList<String>();

        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("rock");
        rockList.add("not rock");
        System.out.println(rockList);
        System.out.println("-------------------------------------");
        System.out.println("Found an object in the List that is not a rock and need to delete it");
        rockList.remove(3);
        System.out.println("-------------------------------------");
        System.out.println(rockList);
        Thread.sleep(1000);
        HashMap <String, String> fossilList = new HashMap<>();
        fossilList.put("Bird Fossil", "has wings and can fly");
        fossilList.put("Fish Fossil", "vaguely fish shaped implies there was once water");
        fossilList.put("Tooth Fossil", "tooth from an unknown fossil");
        System.out.println("Fossil data downloaded");
        System.out.println("-------------------------------------");

        System.out.println("Which of the fossils would you like to learn more about? (Bird, Fish, or Tooth" );
        Scanner scan = new Scanner(System.in);

        System.out.println("-------------------------------------");
        String fossilInfo = scan.nextLine();

        if(fossilInfo.equalsIgnoreCase("Bird Fossil")) {
            System.out.println("Fossil: " + fossilInfo + "\nDescription: " + fossilList.get(fossilInfo));
            System.out.println("-------------------------------------");
        } else if (fossilInfo.equalsIgnoreCase("Fish Fossil")) {
            System.out.println("Fossil: " + fossilInfo + "\nDescription: " + fossilList.get(fossilInfo));
            System.out.println("-------------------------------------");
        }
        else if(fossilInfo.equalsIgnoreCase("Tooth Fossil")) {
            System.out.println("Fossil: " + fossilInfo + "\nDescription: " + fossilList.get(fossilInfo));
            System.out.println("-------------------------------------");
        }
        else
            System.out.println("You entered a fossil not on the list");

        HashSet<String> supplies = new HashSet<String>();
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        supplies.add("lighter");
        supplies.add("flash light");
        supplies.add("blanket");
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");

        //creates iterator object
        Iterator itr = supplies.iterator();

        //check elements presence, if not there loop breakes
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
