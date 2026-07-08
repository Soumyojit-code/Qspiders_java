package Qspider_java;

public class Car
{
    String brand;
    double price;
    Engine e;
    Car(String brand, double price, int hp,int torque)
    {
        this.brand = brand;
        this.price = price;
       e = new Engine(hp,torque);
    }

}
