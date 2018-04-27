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
public class Villa extends Building{
    private int roomCounter;
    private boolean swimmingPool;
    
    public Villa(String owner, String address, int area, int roomCounter, boolean swimmingPool){
        this.owner = owner;
        this.address = address;
        this.area = area;
        this.roomCounter = roomCounter;
        this.swimmingPool = swimmingPool;
    }
    
    public int tax(){
        int taxVal = 100*roomCounter;
        if (swimmingPool){
            return taxVal+750;
        }
        return taxVal;
    }
    
    public boolean hasSwimmingPool(){
        return this.swimmingPool;
    }
    
    
    public void print(){
        super.print();
        System.out.println(", Room counter:"+this.roomCounter+" rooms, "+"Swimming pool:"+this.swimmingPool);
    }
}
