public class Mars extends GuessingGame{
    public static void main(String[] args) throws InterruptedException {
        mealsRemaining();
        locationCheck(5);
        landingCheck(100);
//        new GuessingGame();
        new MarsExpedition();
    }

    public static void mealsRemaining() {
        String colonyName = "Roanoke";
        boolean landing = true;
        int shipPopulation = 300;
        double meals = 4000.00;
        double mealsPerDay = .75;
        int landingDays = 2;
        meals = meals - (mealsPerDay * shipPopulation * landingDays);
        System.out.println("There are " + meals + " meals remaining after landing.");
        meals = meals * 1.5;
        System.out.println("After finding an extra crate of food we now have " + meals + " remaining.");
        shipPopulation += 5;
        System.out.println("Congratulations " + colonyName + "! to the families that had babies while we were in the sky, we now have " + shipPopulation + " people on board.");
    }

    public static void locationCheck(int minutesLeft) {
        String landingLocation = "The Plain";

        if (landingLocation.equals("The Plain.")) {
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain.");
        }
    }

    private static boolean landingCheck(int minutesLeft) throws InterruptedException {
        for (int minute = 0; minute <= minutesLeft; minute++) {
            if ((minute % 3) == 0) {
                if ((minute % 2) == 0)
                    System.out.println("Keep Center");
                } else if((minute % 3) == 0) {
                    System.out.println("Left");
                } else if((minute % 2) == 0) {
                    System.out.println("Right");
                } else
                    System.out.println("Calculating");
            }
        System.out.println("Landed");
        return false;
    }
}