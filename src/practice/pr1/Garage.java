package practice.pr1;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println(vehicle.getInfo() + " добавлен в гараж.");
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
        System.out.println(vehicle.getInfo() + " удалён из гаража.");
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
