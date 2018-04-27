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
public abstract class Geometry3D extends Geometry{
    

    protected Geometry3D(String n){
        super(n);
    }  
    
    public abstract double volume();
}
