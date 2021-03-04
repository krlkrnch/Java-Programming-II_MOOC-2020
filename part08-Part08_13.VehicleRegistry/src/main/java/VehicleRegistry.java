
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> register;

    public VehicleRegistry() {
        this.register = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {

        if (!this.register.keySet().contains(licensePlate)) {
            this.register.put(licensePlate, owner);
            return true;

        }
        return false;
    }

    public String get(LicensePlate licensePlate) {

        if (this.register.containsKey(licensePlate)) {
            return this.register.get(licensePlate);
        }
        return null;

    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.register.keySet().contains(licensePlate)) {
            this.register.remove(licensePlate);
            return true;
        }

        return false;

    }

    public void printLicensePlates() {
        for (LicensePlate plates : this.register.keySet()) {
            System.out.println(plates);
        }
    }

    public void printOwners() {
        ArrayList<String> licensePlates = new ArrayList<>();
        
        for (String values : this.register.values()) {
            if (!licensePlates.contains(values)) {
                licensePlates.add(values);
                System.out.println(values);
            }
        }
    }
}
