import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class PuzzleMethods {

    Random randMachine = new Random();

    public int[] getTenRolls() {
        int[] randomNumbers = new int[10];

        for (int i = 0; i < 10; i++) {
            int currentNumber = randMachine.nextInt(20) + 1;
            randomNumbers[i] = currentNumber;
        }

        // System.out.println(randomNumbers);

        return randomNumbers;
    }

    public char getRandomLetter() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabetArray = new char[26];

        for (int i = 0; i < alphabet.length(); i++) {
            alphabetArray[i] = alphabet.charAt(i);
        }

        int randomIndex = randMachine.nextInt(26);

        // System.out.println(alphabetArray[randomIndex]);

        return alphabetArray[randomIndex];
    }

    public String generatePassword() {
        String newPassword = "";

        while (newPassword.length() < 9) {
            char currentLetter = getRandomLetter();
            newPassword += currentLetter;
        }

        return newPassword;
    }

    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> passwordSet = new ArrayList<String>();

        for (int i = 0; i < length; i++) {
            passwordSet.add(generatePassword());
        }

        return passwordSet;
    }

    public ArrayList<String> shuffleArray(ArrayList<String> arrayToShuffle) {

        for (int i = 0; i < arrayToShuffle.size(); i++) {
            int firstRandomIndex = randMachine.nextInt(arrayToShuffle.size());
            int secondRandomIndex = randMachine.nextInt(arrayToShuffle.size());
            Collections.swap(arrayToShuffle, firstRandomIndex, secondRandomIndex);
        }

        return arrayToShuffle;
    }
}
