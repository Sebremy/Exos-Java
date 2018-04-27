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
public class Circle extends Ellipsis{
    
    public Circle (String n, double radius){
        super(n, radius, radius);
    }
    
    public double perimeter(){
        return 2*Math.PI*this.bigRadius;
    }
}
