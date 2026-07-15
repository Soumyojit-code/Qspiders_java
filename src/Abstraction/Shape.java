package Abstraction;

abstract class Shape
{

    abstract double calcArea();
}
class Rectangle extends Shape
{
    double length=5 ;
    double breadth=7;
    double calcArea()
    {


        return length*breadth;
    }
}
class Circle extends Shape
{
    double radius=3;

    double calcArea()
    {
      return Math.PI*radius*radius;
    }
}
class squre extends Shape
{
    double side=7;
    double calcArea()
    {

        return side*side;

    }
}
class Main
{
    public static void main(String[] args)
    {
        Shape s1=new Rectangle();
        System.out.println(s1.calcArea());
        s1=new Circle();
        System.out.println(s1.calcArea());
        s1=new squre();
        System.out.println(s1.calcArea());
    }
}
