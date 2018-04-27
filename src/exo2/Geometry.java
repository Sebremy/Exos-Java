/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo2;

import java.lang.String;

/**
 *
 * @author Sebremy
 */
public abstract class Geometry {
    protected String name;
    
    protected Geometry(String n){
        this.name = n;
    }
    
    public abstract double area();
}
