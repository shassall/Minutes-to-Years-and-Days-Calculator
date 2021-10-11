public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes < 0L){
            System.out.println("Invalid Value");
        }else{
            long days = minutes / (60L * 24L);
            long years = days / 365L;
            days = days % 365L;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
