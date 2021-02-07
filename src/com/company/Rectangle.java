package com.company;

public class Rectangle {
    double x;double y;
    public Rectangle(double x,double y){
        this.x=x;this.y=y;
    }
    public Rectangle(double x){
        this.x=x;this.y=x;
    }
    public double calculateArea(){
        return x*y;
    }
    public void printArea(){
        System.out.println(calculateArea());
    }
    public void printRectangleKind(){
        if (this.x==this.y){System.out.println( "Это квадрат");}
        else{System.out.println("Это прямоугольник");}
    }
    public boolean isTheSameRectangle(Rectangle rectangle){
        if (this.x==rectangle.x&&this.y==rectangle.y){return true;}else{return false;}
    }
}
