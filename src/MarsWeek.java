public class MarsWeek {
    public static void main(String[] args) {
        mealsRemaining();
        locationCheck();

    }
        public static void mealsRemaining() {
//            String colonyName = "Roanoke";
//            boolean landing = true;
            int shipPopulation = 300;
            double meals = 4000.00;
            double mealsPerDay = .75;
//            int landingDays = 2;
            meals = meals - (mealsPerDay * shipPopulation * 2);
            System.out.println("There are " + meals + " meals remaining after landing.");
            meals = meals * 1.5;
            System.out.println("After finding an extra crate of food we now have " + meals + " remaining.");
            shipPopulation+= 5;
            System.out.println("Congratulations to the families that had babies while we landed, we now have "  + shipPopulation +  " people on board.");
        }
        public static void locationCheck() {
        String landingLocation = "The Hill";
        if(landingLocation.equals("The Plain.")){
                System.out.println("Bbzzz Landing on the Plain");
            }
        else
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain.");
        }
}
