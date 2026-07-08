package Qspider_java;

public class Main
{
    public static void main(String[] args)
    {
        Car c=new Car("BMW",10,16000,300);
        System.out.println(c.brand);
        System.out.println(c.e.hp);
        System.out.println(c.e.torque);
    }
}
