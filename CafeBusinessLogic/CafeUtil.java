import java.util.ArrayList;
import java.text.DecimalFormat;

public class CafeUtil {

    public int getStreakGoal(int numWeeks) {
        // sums together every consecutive integer from 1 to 10
        // returns sum
        // bonus: add numWeeks param so the amount can be changed from 10 to whatever
        int sum = 0;
        int i = 1;
        // for (int i = 1; i <= numWeeks; i++) {
        // sum += i;
        // }
        while (i <= numWeeks) {
            sum += i;
            i++;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        // sum all prices in array and return total
        double total = 0.00;

        for (double eachPrice : prices) {
            total += eachPrice;
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        // given ArrayList of String, print out each index and menu item
        // void -- no return;
        for (int i = 0; i < menuItems.size(); i++) {
            String eachItem = menuItems.get(i);
            System.out.printf("%s %s\n", i, eachItem);
        }
    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if (menuItems.size() != prices.size()) {
            return false;
        }

        for (int i = 0; i < menuItems.size(); i++) {
            String eachItem = menuItems.get(i);
            Double eachPrice = prices.get(i);
            DecimalFormat doubleToDollar = new DecimalFormat("$0.00");
            String total = doubleToDollar.format(eachPrice);

            System.out.printf("%s %s -- %s\n", i, eachItem, total);
        }
        return true;
    }

    public void addCustomer(ArrayList<String> customers) {
        // print "Please enter your name:"
        System.out.println("Please enter your name: ");

        // add this line: String userName = System.console().readLine();
        String userName = System.console().readLine();
        System.out.println("Hello " + userName + "!");

        // print "There are __ people in front of you"
        System.out.println("There are " + customers.size() + " people in front of you.");

        // add customer's name to given list, print list
        customers.add(userName);
        System.out.println(customers);

        // no return;
    }

    public void printPriceChart(String product, double price, int maxQuatity) {
        System.out.println(product);
        double discount = 0.00;

        for (int i = 1; i <= maxQuatity; i++) {
            if (i > 1) {
                discount += 0.50;
            }
            double currentPrice = price * i - discount;
            DecimalFormat doubleToDollar = new DecimalFormat("$0.00");
            String total = doubleToDollar.format(currentPrice);
            System.out.println(i + " - " + total + "\n");
        }
    }
}