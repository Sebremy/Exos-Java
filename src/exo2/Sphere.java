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
public class Sphere extends Geometry3D{
    protected double radius;
    
    
    public Sphere(String n, double r){
        super(n);
        this.radius = r;
    }
    
    public double area(){
        return 4*Math.PI*radius*radius;
    }
    
    public double volume(){
        return (4*Math.PI/3)*radius*radius*radius;
    }
    
}
