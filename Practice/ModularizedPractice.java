import java.util.Date;

public class ModularizedPractice {

    public String getCurrentDate() {
        Date date = new Date();
        return "Current date is " + date;
    }

    public String executionTime() {
        long start = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }

        long end = System.currentTimeMillis();
        double total = (double) (end - start) / 1000;

        return "Time of execution " + total + " seconds";
    }
}
