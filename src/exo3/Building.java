/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo3;
import java.lang.String;

/**
 *
 * @author Sebremy
 */
public abstract class Building {
    protected String owner;
    protected String address;
    protected int area;
    
    
    public abstract int tax();
    
    public void print(){
        System.out.print("Owner:"+this.owner+", Address:"+this.address+", Area:"+this.area+"m²");
    }
    
    public int getArea(){
        return this.area;
    }
}
