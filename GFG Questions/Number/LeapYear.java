/**
 * LeapYear
 */
public class LeapYear {

    public static boolean isLeapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0) && !(year % 100 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int year = 2045;
        System.out.println(isLeapYear(year));
    }
}