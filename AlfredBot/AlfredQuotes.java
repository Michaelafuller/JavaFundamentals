import java.util.Date;
import java.text.SimpleDateFormat;

public class AlfredQuotes {

    // No params, basic greeting
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    // name as params, string interpolated %s (looking for string)
    public String guestGreeting(String name) {
        return String.format("Good day, %s. It is a pleasure to meet you.", name);
    }

    // Overloaded -- boolean simply to differentiate
    // SimpleDateFormat is unreadable until translated into Date();
    // dayFormat initialized to catch others, thin out code
    public String guestGreeting(String name, Boolean isHappy) {
        SimpleDateFormat time = new SimpleDateFormat("kk");
        String hour = time.format(new Date());
        String dayFormat = "evening";

        if (Integer.parseInt(hour) < 12) {
            dayFormat = "morning";
        } else if (Integer.parseInt(hour) < 16) {
            dayFormat = "afternoon";
        }
        return String.format("Good %s, %s", dayFormat, name);
    }

    // Simple string concatenation
    public String dateAnnouncement() {
        Date date = new Date();
        return "The current date is: " + date;
    }

    // indexOf 0 -- looking for typical "Alexa, make me...?" phrase
    // perhaps a .contains() would be more appropriate
    public String respondBeforeAlexa(String conversation) {
        if (conversation.indexOf("Alexa") == 0) {
            return "Right away, sir. She certainly isn't sophisticaed enough for that.";
        }
        if (conversation.contains("Alfred")) {
            return "At your service. As you wish, naturally.";
        }
        return "Right. And with that I shall retire.";
    }
}
