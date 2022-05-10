import java.util.Date;

public class Greetings {
    public String getCurrentdate() {
        Date date = new Date();
        return "The current date is: " + date;
    }

    public String greetEnglish(String name) {
        return "Hello, " + name;
    }

    public String greetSpanish(String name) {
        return "Hola, " + name;
    }
}
