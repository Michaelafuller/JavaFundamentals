import java.util.ArrayList;

class NotAnIntegerException extends Exception {
};

public class TryCatch {

    public boolean listMaker(ArrayList<Object> arrayList) throws NotAnIntegerException {
        boolean worksFine = false;

        for (int i = 0; i < arrayList.size(); i++) {
            try {
                Integer castedValue = (Integer) arrayList.get(i);
            } catch (Exception e) {
                // System.out.println("Cannot explicitly convert this type to Integer! Method
                // exception");
                throw new NotAnIntegerException();
                // return false;
            }
            worksFine = true;
        }

        if (worksFine) {
            return true;
        }
        return false;
    }
}
