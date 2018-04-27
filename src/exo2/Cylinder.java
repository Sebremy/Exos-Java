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
public class Cylinder extends Geometry3D{
    protected Circle circle;
    protected Rectangle rectangle;
    
    public Cylinder(String n, double r, double h){
        super(n);
        this.circle = new Circle(n+"-circle", r);
        this.rectangle = new Rectangle(n+"-rectangle", circle.perimeter(), h);
    }
    
    public double area(){
        return 2*circle.area()+rectangle.area();
    }
    
    public double volume(){
        return circle.area()*rectangle.widht;
    }
    
}
