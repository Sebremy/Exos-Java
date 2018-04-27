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
public class Ellipsis extends Geometry2D{
    protected double bigRadius;
    protected double littleRadius;
    
    public Ellipsis(String n, double bR, double lR){
        super(n);
        this.bigRadius = bR;
        this.littleRadius = lR;
    }
    
    public double area(){
        return Math.PI*bigRadius*littleRadius;
    }
    
    public double perimeter(){
        return 0.0;
    }
    
}
