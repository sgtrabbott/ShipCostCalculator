public class ShipCosts
{
    public static void main(String[] args)
    {
        final int free_ship = 100;
        int item_cost = 12232;
        double ship_cost = (item_cost * .02);
        double paid_ship = (ship_cost + item_cost);

        if (item_cost >= free_ship) {
            System.out.println("You reached free shipping! $" + item_cost);
            System.out.println("Your shipping is FREE!");
        }
        else
        {
            System.out.println("You haven't reached free shipping, yet! $" + item_cost);
            System.out.println("The cost of shipping is $" + ship_cost);
        }
    }
}