import java.util.ArrayList;

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
    }
}
