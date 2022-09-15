package Day2;


import java.util.Scanner;

public class TShirtCompany {

    static {
        System.out.println("Welcome to TShirts shop");
    }

    public void Customers() {
        int TShirt = 50;

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
