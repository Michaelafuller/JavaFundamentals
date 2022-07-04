import java.util.Random;

class OutOfGaseException extends Exception {
}

public class UnreliableFriend {

    public boolean deliverMessage() throws OutOfGaseException {
        Random randGenerator = new Random();
        boolean hasGas = randGenerator.nextBoolean();

        if (hasGas) {
            return true;
        }

        throw new OutOfGaseException();
    }
}
