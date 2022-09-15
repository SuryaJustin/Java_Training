package Day2;

import javafx.scene.Scene;

import java.util.Scanner;

public class TShirtCompany {

    static {
        System.out.println("Welcome to TShirts shop");
    }

    public void Customers() {
        int TShirt = 50;

        for (int i = 0; i < TShirt;) {
            Scanner sc = new Scanner(System.in);
            int count = sc.nextInt();
            String colour = sc.next();
            char size = sc.next().charAt(0);
            System.out.println("Tshirt Count= " + count + "TShirt color= " + colour + "TShirt" + size);
            int add = i+count;
           i=add;

        }

    }
}
