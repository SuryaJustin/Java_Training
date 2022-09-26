package Day2;

// Class contains variables, method, main method, object
//class has the ability to access all the data members (dara members and mthods) of the main class uncluding privte
//we declare the class as final class(){} we can't inherit

//Object gives memory allocation
//Object is a single instance of a class

import java.util.Scanner;

public class TShirtCompany {

    //static block exeute first when we run the program
    //we declare publi static --> we call the method as global
    static { 
        System.out.println("Welcome to TShirts shop");
    }

    public void Customers() {
        int TShirt = 50;

        //For loop is repeating actoin
        //For loop travel both forward and backward direction
        //For loop is condition based one
        for (int i = 0; i <TShirt; ) {  
            Scanner sc = new Scanner(System.in);
            int count = sc.nextInt();
            String colour = sc.next();
            char size = sc.next().charAt(0);

            i = i + count;

            if (i <=50) {
                System.out.println("Tshirt Count= " + count + "TShirt color= " + colour + "TShirt" + size);
            } else {
                System.out.println("Please enter minimum count");
                i = i - count;
            }

        }

    }
}
