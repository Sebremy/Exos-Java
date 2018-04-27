/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Sebremy
 */
import java.io.IOException; 
 
class AThing {     
    public int x; 
 
    public AThing(int a) {         
        System.out.println("Begin constructor AThing");         
        x = a;         
        System.out.println("AThing, x = " + x);         
        System.out.println("End constructor AThing");     
    } 
 
    public void delete() {         
        System.out.println("Begin delete AThing, x = " + x);         
        System.out.println("End delete AThing");     
    } 
} 
 
class BThing {     
    public AThing aThing;     
    public int y; 
 
 
 
    public BThing(int a, int b) {         
        System.out.println("Begin constructor BThing");         
        y = b;         
        System.out.println("BThing, y = " + y);         
        aThing = new AThing(a);         
        System.out.println("End constructor BThing");     
    } 
 
    public void delete() {         
        System.out.println("Begin delete BThing, y = " + y);         
        aThing.delete();         
        System.out.println("End delete BThing");     
    } 
    
    public void print() {     
        System.out.println("aThing.x = " + aThing.x + " y = " + y); 
    } 
} 
 
class CThing extends BThing {     
    int z; 
 
    CThing(int a, int b, int c) {         
        super(a, a + b);         
        System.out.println("Begin constructor CThing");         
        z = c;         System.out.println("CThing, z = " + z);         
        System.out.println("End constructor CThing");     
    } 
 
    public void delete() {         
        System.out.println("Begin delete CThing, z = " + z);         
        System.out.println("End delete CThing");         
        super.delete();     
    } 
    
    public void print() {     
        System.out.println("aThing.x = " + aThing.x + " y = " + y + " z = " + z); 
    }
} 

public class Test{
    public static void main(String[] args) {
        System.out.println("Begin main allocation");         
         BThing bThing = new BThing(1, 2);         
         CThing cThing = new CThing(3, 4, 5);         
         System.out.println("End main allocation"); 
         
         System.out.println("bThing = "); 
         bThing.print();         
         System.out.println("cThing = "); 
         cThing.print();
         
         System.out.println("Begin main delete");         
         cThing.delete();         
         cThing = null;         
         bThing.delete();        
         cThing = null;         
         System.out.println("End main delete"); 
    }
}