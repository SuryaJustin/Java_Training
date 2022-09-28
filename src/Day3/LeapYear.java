package Day3;

import java.util.Scanner;

public class LeapYear {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int year;   //Year Declaration
        System.out.println("Enter the year");
        year=sc.nextInt();   //Year Initialization

        //Check for leap year
        if(((year % 4 == 0) && (year % 100 != 0)) ||
                (year % 400 == 0))
            System.out.println(year+" is a leap year");
        else
            System.out.println(year+" is not a leap year");
    }
}
