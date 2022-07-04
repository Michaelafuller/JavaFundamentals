import java.util.ArrayList;

public class TestTryCatch {
    public static void main(String[] args) {

        // UnreliableFriend steve = new UnreliableFriend();

        // try {
        // steve.deliverMessage();
        // System.out.println("The message was delivered!");
        // } catch (OutOfGaseException e) {
        // System.out.println("Hey, uh, so, I ran out of gas...");
        // }

        TryCatch tryCatch = new TryCatch();
        ArrayList<Object> myList = new ArrayList<>();
        myList.add("13");
        myList.add("Hello World!");
        myList.add(48);
        myList.add("Goodbye, cruel world!");

        try {
            tryCatch.listMaker(myList);
            System.out.println("Works fine!");
        } catch (NotAnIntegerException e) {
            System.out.println("Can't explicitly convert this type to Integer!");
        }
    }
}