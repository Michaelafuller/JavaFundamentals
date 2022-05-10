public class AlfredTest {

    public static void main(String[] args) {
        AlfredQuotes alfredBot = new AlfredQuotes();

        // Each string instantiates and calls class method
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Beth Kane");
        String testGuestGreeting2 = alfredBot.guestGreeting("Mike", true);
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        String alexaTest = alfredBot.respondBeforeAlexa(
                "Alexa! Play some low-fi beats.");
        String alfredTest = alfredBot.respondBeforeAlexa(
                "I can't find my yo-yo. Maybe Alfred will know where it is.");
        String notRelevantTest = alfredBot.respondBeforeAlexa(
                "Maybe that's what Batman is about. Not winning. But failing...");

        System.out.println(testGreeting);

        System.out.println(testGuestGreeting);
        System.out.println(testGuestGreeting2);
        System.out.println(testDateAnnouncement);
        System.out.println(alexaTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);
    }
}