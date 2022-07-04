import java.util.HashMap;

public class TestEPMaker {
    public static void main(String[] args) {

        EPMaker ePMaker = new EPMaker();
        HashMap<String, String> newTrackList = ePMaker.makeNewTrackMap();
        System.out.println(newTrackList.get("Brand New Title"));

    }
}