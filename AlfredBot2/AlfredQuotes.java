import java.util.Date;
import java.text.SimpleDateFormat;

public class AlfredQuotes {

    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        return String.format("Hello, %s. Lovely to see you.", name);
    }

    public String guestGreeting() {
        SimpleDateFormat hour = new SimpleDateFormat("kk");
        String timeString = hour.format(new Date());
        String dayFormat;
        // SimpleDateFormat time = new SimpleDateFormat("kk");
        // String hour = time.format(new Date());
        // String dayFormat = "evening";

        if (Integer.parseInt(timeString) < 12) {
            dayFormat = "morning.";
        } else if (Integer.parseInt(timeString) < 16) {
            dayFormat = "afternoon.";
        } else {
            dayFormat = "evening.";
        }
        return "Good " + dayFormat;
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently " + date;
    }

    public String respondBeforeAlexa(String conversation) {
        if (conversation.indexOf("Alexa") > -1) {
            return "Right away, sir. She certainly isn't sophisticaed enough for that.";
        } else if (conversation.indexOf("Alfred") > -1) {
            return "At your service. As you wish, naturally";
        }

        return "Right. And with that I shall retire.";
    }
}
