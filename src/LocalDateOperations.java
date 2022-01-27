/*
         Mahadev
         27 jan 2022
         Local date operations
 */

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LocalDateOperations
{
    public static int day;

    public void Local_Date_Operations() {
        Scanner scanner = new Scanner(System.in);
        LocalDate localDate = LocalDate.now();
        System.out.println("Current date is  " + localDate);
        System.out.println("Please Enter Number of days  ");
        System.out.println("For upcoming date enter positive integer: ");
        System.out.println("For previous date enter negative integer :");
        try {
            day = scanner.nextInt();
            if (day > 0) {
                LocalDate upcoming = localDate.plusDays(day);
                System.out.println(day + " days after current date is " + upcoming + " day is " + upcoming.getDayOfWeek());
            }
            if (day < 0) {
                day = -(day);
                LocalDate previous = localDate.minusDays(day);
                System.out.println(day + " days before current date is " + previous + " day is " + previous.getDayOfWeek());
            }
            if (day == 0) {
                System.out.println("Current date is  " + localDate + "   " + localDate.getDayOfWeek());
            }


        } catch (InputMismatchException e) {
            System.out.println("Please enter Integer or Number:");
            Local_Date_Operations();
        }
    }

    public static void main(String[] args)
    {
        LocalDateOperations localDateOperations = new LocalDateOperations();
        localDateOperations.Local_Date_Operations();
    }
}
