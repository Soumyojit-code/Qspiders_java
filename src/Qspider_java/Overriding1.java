package Qspider_java;

 class Overriding1
{
    String Brand;
    public int Display()
    {
        System.out.println("Vechile");
        return 0;
    }
}
class Overriding2 extends Overriding1
{
   double Price;
   public int Display()
   {
       System.out.println("Car");
       return 0;
   }
}
 class excute
{
    public static void main(String[] args)
    {
        Overriding1 obj1 = new Overriding1();
        System.out.println(obj1.Display());
        Overriding2 obj = new Overriding2();
        System.out.println(obj.Display());
    }

}
