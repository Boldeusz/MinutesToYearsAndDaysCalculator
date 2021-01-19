public class MinutesToYearsAndDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        }
        long days = minutes / 1440;
        long remainingDays = days % 365;
        long years = days / 365;
        System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
    }
}
