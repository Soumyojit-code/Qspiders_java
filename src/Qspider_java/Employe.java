package Qspider_java;

 class Demo
{
    String name;
    int age;
    String location;
    Demo( String name, int age, String location )
    {
        this.name = name;
        this.age = age;
        this.location = location;

    }
    public void Details()
    {
        System.out.println("Name: " + name + ", Age: " + age + ", Location: " + location);
    }
}
public class Employe
{
    public static void main(String[] args)
    {
        Demo d1=new Demo("Sumon",65,"karimpur");
        Demo d2=new Demo("Dip",15,"kolkata");
        d1.Details();
        d2.Details();
    }
}
