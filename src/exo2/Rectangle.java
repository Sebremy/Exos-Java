/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo2;

/**
 *
 * @author Sebremy
 */
public class Rectangle extends Geometry2D{
    protected double lenght;
    protected double widht;
    
    public Rectangle(String n, double l, double w){
        super(n);
        this.lenght = l;
        this.widht = w;
    }
    
    public double area(){
        return lenght*widht;
    }
    
    public double perimeter(){
        return (lenght+widht)*2;
    }
}
