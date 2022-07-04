import java.util.HashMap;
import java.util.Set;

public class EPMaker {

    public HashMap<String, String> makeNewTrackMap() {
        HashMap<String, String> newTrackMap = new HashMap<>();

        newTrackMap.put("Brand New Title", "Here are some different lyrics");
        newTrackMap.put("Another New Title", "Here are some lyrics");
        newTrackMap.put("Yet Another New Title", "Here are some lyrics");
        newTrackMap.put("Still A New Title", "Here are some lyrics");

        Set<String> trackList = newTrackMap.keySet();

        for (String key : trackList) {
            System.out.println(key);
            System.out.println(newTrackMap.get(key));
        }

        return newTrackMap;

    }
}
