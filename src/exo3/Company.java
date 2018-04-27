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
public class Company extends Building{
    String name;
    int employeeCounter;
    double avg;
    
    public Company(String owner, String address, int area, String name, int employeeCounter, double avg){
        this.owner = owner;
        this.address = address;
        this.area = area;
        this.name = name;
        this.employeeCounter = employeeCounter;
        this.avg = avg;
    }
    
    public int tax(){
        return (int)(6.3*this.area);
    }
    
    public void print(){
        super.print();
        System.out.println(", name:"+this.name+", Employee counter:"+this.employeeCounter+", average:"+this.avg);
    }
    
}
