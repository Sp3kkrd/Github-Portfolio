package hashmap;

import java.util.HashMap;

public class HashMapAct {
    private HashMap<String, String> map;

    public HashMapAct() {
        this.map = new HashMap<>();
    }

    public void addKeyValue(String key, String value) {
        map.put(key, value);
    }

    public void removeKeyValue(String key) {
        map.remove(key);
    }

    public String getValue(String key) {
        return map.get(key);
    }

    public void displayKeyValuePairs() {
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}

