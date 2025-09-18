package practice.pr1;

import java.util.ArrayList;
import java.util.List;

public class Fleet {
    private List<Garage> garages = new ArrayList<>();

    public void addGarage(Garage garage) {
        garages.add(garage);
        System.out.println("Гараж добавлен в автопарк.");
    }

    public void removeGarage(Garage garage) {
        garages.remove(garage);
        System.out.println("Гараж удалён из автопарка.");
    }

    public void findVehicle(String brand) {
        for (Garage garage : garages) {
            for (Vehicle v : garage.getVehicles()) {
                if (v.getInfo().contains(brand)) {
                    System.out.println("Найдено: " + v.getInfo());
                }
            }
        }
    }
}
