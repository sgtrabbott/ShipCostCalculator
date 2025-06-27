import java.util.Scanner;

public class ShipCosts {
    public static void main(String[] args) {
        //Variables
        Scanner in = new Scanner(System.in);
        final double free_ship = 100;
        double item_cost = 0;
        double ship_cost = 0;
        double total_cost = 0;

        //Scanner
        System.out.print("Price of your item: ");

        if (in.hasNextDouble()) {
            item_cost = in.nextDouble();
            in.nextLine();
            //They Spent Enough
            if (item_cost >= free_ship) {
                ship_cost = 0;
                total_cost = item_cost;
                System.out.println("You reached free shipping!");
                // They Did not spend enough
            } else {
                ship_cost = item_cost * 0.02;
                total_cost = item_cost + ship_cost;
                System.out.println("The cost of shipping is $" + ship_cost);
            }
            System.out.println("Your total with shipping is: $" + total_cost);
        }
    }
}