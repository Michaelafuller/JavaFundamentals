import java.util.ArrayList;

public class TestCafe {

    public static void main(String[] args) {

        CafeUtil cafeUtil = new CafeUtil();

        // System.out.println("\n----- Streak Goal Test -----");
        // System.out.printf("Purchases needed by week 10: %s \n\n",
        // cafeUtil.getStreakGoal(10));

        // System.out.println("----- Order Total Test-----");
        // double[] lineItems = { 3.5, 1.5, 4.0, 4.5 };
        // System.out.printf("Order total: %s \n\n", cafeUtil.getOrderTotal(lineItems));

        System.out.println("----- Display Menu Test-----");
        ArrayList<String> menu = new ArrayList<String>();
        ArrayList<Double> menuPrice = new ArrayList<Double>();
        menu.add("drip cofee");
        menuPrice.add(1.5);
        menu.add("cappuccino");
        menuPrice.add(3.5);
        menu.add("latte");
        menuPrice.add(4.5);
        menu.add("mocha");
        menuPrice.add(3.5);
        cafeUtil.displayMenu(menu, menuPrice);

        // System.out.println("\n----- Add Customer Test-----");
        // ArrayList<String> customers = new ArrayList<String>();
        // // ---- Test 4 times ----
        // for (int i = 0; i < 4; i++) {
        // cafeUtil.addCustomer(customers);
        // System.out.println("\n");
        // }

        // System.out.println("\n----- Add Customer Test-----");
        // cafeUtil.printPriceChart("Columbian Coffee Grounds", 2.00, 4);
    }
}
