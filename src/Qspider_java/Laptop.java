package Qspider_java;

public class Laptop
{
    int ram;
    String brand;
    double price;
    Processor p;
 Laptop(int ram, String brand, double price, int core,float hz)
 {
     this.ram = ram;
     this.brand = brand;
     this.price = price;
     p =new Processor(core,hz);
 }
}
 class Processor
 {
     int core;
     float hz;
     Processor(int core, float hz)
     {
         this.core = core;
         this.hz = hz;
     }
 }
class run {
    public static void main(String[] args)
    {
        Laptop lp = new Laptop(8, "hp", 102000, 5, 1);
        System.out.println(lp.ram + " " + lp.brand + " " + lp.price + " " + lp.p .core+  " " + lp.p.core );
    }
}