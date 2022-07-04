import java.util.Set;
import java.util.HashMap;

public class HashMapPracice {
    public HashMap<String, String> getHashMap() {
        HashMap<String, String> myHashMap = new HashMap<String, String>();

        myHashMap.put("ninja@cd.com", "Nancy Ninja");
        myHashMap.put("samurai@cd.com", "Sam samurai");
        myHashMap.put("wizard@cd.com", "Walter wizard");

        Set<String> keys = myHashMap.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(myHashMap.get(key));
        }

        return myHashMap;
    }
}
