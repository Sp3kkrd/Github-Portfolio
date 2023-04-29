package hashmap;

public class Main {
    public static void main(String[] args) {
        HashMapAct HashMapAct = new HashMapAct();

        // Add key/value pairs to the map
        HashMapAct.addKeyValue("F150", "Truck");
        HashMapAct.addKeyValue("F250", "Truck");
        HashMapAct.addKeyValue("Corola", "Car");

        // Display all key/value pairs in the map
        HashMapAct.displayKeyValuePairs();

        // Remove a key/value pair from the map
        HashMapAct.removeKeyValue("F250");

        // Display all key/value pairs in the map again
        HashMapAct.displayKeyValuePairs();
    }
}

