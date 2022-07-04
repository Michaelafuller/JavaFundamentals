import java.util.ArrayList;

public class PuzzleJava {
    public static void main(String[] args) {

        PuzzleMethods methods = new PuzzleMethods();

        // methods.getTenRolls();
        // int[] randomRolls = methods.getTenRolls();
        // System.out.println(randomRolls);

        // methods.getRandomLetter();

        // String newPassword = methods.generatePassword();
        // System.out.println(newPassword);

        ArrayList<String> newPasswords = methods.getNewPasswordSet(5);
        System.out.println(newPasswords);
        methods.shuffleArray(newPasswords);
        System.out.println(newPasswords);
    }
}