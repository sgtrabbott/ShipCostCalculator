public class ShipCosts
{
    public static void main(String[] args)
    {
        final int free_ship = 100;
        int item_cost = 123;

        if (item_cost >= free_ship) {
            System.out.println("You get free shipping!");
        }
        else
        {
            System.out.println("You haven't reached free shipping, yet!");
        }
    }
}