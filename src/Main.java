//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("====1====");
        OrderService orderService = new OrderService();
        orderService.CreateOrder("laptop",7,800.5);
        orderService.UpdateOrder("pc",15,1000);

        System.out.println("---------");
        veh Car =new Car();
        Car.Start();
        Car.Stop();
        System.out.println("---------");
        veh Track = new Track();
        Track.Start();
        Track.Stop();
        System.out.println("====2====");
        Calc calc= new Calc();
        System.out.println("sum =" + calc.add(4,9));
        serv serv = new serv();
        serv.dosmth();
        System.out.println("====3====");
        Circle circle=new Circle(4);
        Square square = new Square(6.5);
        System.out.println("circle area = " + circle.CalculateArea());
        System.out.println("square area = " + square.CalculateArea());
    }
}