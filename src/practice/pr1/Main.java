package practice.pr1;

public class Main {
    public static void main(String[] args) {
        // Создаём транспортные средства
        Car car1 = new Car("Toyota", "Camry", 2020, 4, "Автомат");
        Car car2 = new Car("BMW", "X5", 2022, 5, "Механика");
        Motorcycle moto1 = new Motorcycle("Yamaha", "R1", 2019, "Спортбайк", true);

        // Создаём гаражи
        Garage garage1 = new Garage();
        garage1.addVehicle(car1);
        garage1.addVehicle(moto1);

        Garage garage2 = new Garage();
        garage2.addVehicle(car2);

        // Создаём автопарк
        Fleet fleet = new Fleet();
        fleet.addGarage(garage1);
        fleet.addGarage(garage2);

        // Поиск транспорта
        fleet.findVehicle("Toyota");

        // Удаления
        garage1.removeVehicle(moto1);
        fleet.removeGarage(garage2);
    }
}
