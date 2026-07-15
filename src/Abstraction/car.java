package Abstraction;

public abstract class car
{
    public abstract void Drive();
}
class BMW extends car
{
    public void Drive()
    {
        System.out.println("CAR RUNNING");
    }

}
class Run
{
    public static void main(String[] args)
    {
        car b = new BMW();
        b.Drive();
    }
}


