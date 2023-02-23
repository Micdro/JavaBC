import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }

    public static void car()
    {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car();
        car.setColor("Green");
        car.setMake("Porsche");
        car.setDoors(2);
        car.setConvertible(true);
        car.setModel("Carerra");
        car.describeCar();
        System.out.println("Hello world!");
        Car targa = new Car();
        targa.setColor("Red");
        targa.setMake("Porsche");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setModel("Carerra");
        targa.describeCar();
    }
}