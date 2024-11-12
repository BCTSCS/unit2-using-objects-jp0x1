public class APCalendar {

    /**
     * Returns true if year is a leap year and false otherwise.
     */
    private static boolean isLeapYear(int year) {
        // A leap year is divisible by 4, but not divisible by 100, unless also divisible by 400
        boolean isLeap= (year%400 == 0) || (year%4 ==0 && year%100 != 0);
        return isLeap;
    }

    /**
     * Returns the number of leap years between year1 and year2, inclusive.
     * Precondition: 0 <= year1 <= year2
     */
    public static int numberOfLeapYears(int year1, int year2) {
        int count = 0;
        
        return count;
    }
    public static int firstDayOfYear(int year){
        return 2;
    }

    /**
     * Returns the value representing the day of the year, where 1 represents January 1.
     * Precondition: 1 <= month <= 12, 1 <= day <= number of days in month
     *               The date represented by month, day, year is a valid date.
     */
    private static int dayOfYear(int month, int day, int year) {
        //assign number of days in a year to an array
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int dayOfYear = day;
        
        // Check if leap year for February adjustment
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }
        
        // Sum days from previous months
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonth[i];
        }
        
        return dayOfYear;
    }

    /**
     * Returns n, where month, day, and year specify the nth day of the week.
     * 0 represents Sunday, 1 represents Monday, ..., and 6 represents Saturday.
     * Precondition: The date represented by month, day, year is a valid date.
     */
    public static int dayOfWeek(int month, int day, int year) {
        // Modulus by 7 gives us the weekday (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
        int currentDay=0;
        int firstDay = firstDayOfYear(year);
        int numDays = dayOfYear(month, day, year);
        currentDay = (firstDay + numDays-1)%7;
        return currentDay;


    }
    /**
     * Accepts a date string in US format (MM/dd/yyyy or MM-dd-yyyy)and parses using Wrapper classes 
     * and calculates dayOfWeek(int month, int day, int year)

     */
     public static int dayOfWeek(String date ) {
        // Modulus by 7 gives us the weekday (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
        int month = Integer.parseInt(date.substring(0,2));
        int day = Integer.parseInt(date.substring(2, 5));
        int year = Integer.parseInt(date.substring(5));
        return dayOfWeek(month, day, year);


        
        // return currentDay;
    }

     public static void main(String[] args){
        
        AP_Calendar calendar = new AP_Calendar();

        
        System.out.println("Is 2024 a leap year: " + calendar.isLeapYear(2024)); 
        System.out.println("Is 2023 a leap year: " + calendar.isLeapYear(2023));
        
        System.out.println("Number of leap years between 200 and 2024: "+ calendar.numberOfLeapYears(2000,2024));

        System.out.println("Day of year: " + calendar.dayOfYear(3,1,2024));

        System.out.println("The day of week is: "+ calendar.dayOfWeek(3,1,2024));

        System.out.println("The day of week is: "  + calendar.dayOfWeek("03/01/2024"));

    }
}
