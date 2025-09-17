public class OrderService {
    private double totalPrice(int quantity, double price) {
        return quantity * price;
    }
    public void  CreateOrder(String productName, int quantity, double price){
        double totalPrice = quantity * price;
        System.out.println("Order for " + productName+ " created. Total: "+ totalPrice);
    }
    public void UpdateOrder(String productName, int quantity, double price)
    {
        double totalPrice = quantity * price;
        System.out.println("Order for "+ productName+ " updated. New total: "+ totalPrice);
    }

}

