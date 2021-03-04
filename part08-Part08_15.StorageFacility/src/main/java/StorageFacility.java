
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Objects;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> items;

    public StorageFacility() {
        this.items = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.items.putIfAbsent(unit, new ArrayList<>());

        this.items.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.items.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
      
            items.get(storageUnit).remove(item);
        

        if (!items.get(storageUnit).contains(item)) {
            this.items.remove(storageUnit);

        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> storage = new ArrayList<>();
        for (String set : items.keySet()) {
            storage.add(set);

        }
        return storage;
    }

}
