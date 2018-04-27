/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo3;

/**
 *
 * @author Sebremy
 */
public class Main {
    
    public static void main(String[] args) {
        Villa v1 = new Villa("Pierre", "42 chemin des potirons", 250, 12, true);
        v1.print();
        System.out.println("Villa1 tax : "+v1.tax()+"€");
        
        //Test Company
        Company c1 = new Company("Paul", "28 rue des petits ponts", 387, "Sous les ponts", 57, 97.72);
        c1.print();
        System.out.println("Company1 tax : "+c1.tax()+"€"); //= 2438.1
        
        //Array
        Building[] buildArr = new Building[]{
            new Villa("villaOwner1", "villaAddress1", 250, 12, true),
            new Villa("villaOwner2", "villaAddress2", 850, 42, false),
            new Company("companyOwner1", "companyAddress1", 387, "companyName1", 12, 2.4),
            new Company("companyOwner2", "companyAddress2", 120, "companyName1", 12, 2.4),
            new Villa("villaOwner3", "villaAddress3", 100, 3, false),
        };
        
        System.out.println("Total area : "+totalArea(buildArr)+"m²");
        System.out.println("Total tax : "+totalTax(buildArr)+"€");
        System.out.println("Total swimming pool : "+totalSwimmingPool(buildArr));
    }
    

    //Get total tax of a building array
    static int totalTax(Building[] arrayB){
        int taxVal=0;
        
        for (Building b:arrayB){
            taxVal += b.tax();
        }
        
        return taxVal;
    }
    
    static int totalArea(Building[] arrayB){
        int areaVal=0;
        
        for (Building b:arrayB){
            areaVal += b.getArea();
        }
        
        return areaVal;
    }
    
    static int totalSwimmingPool(Building[] arrayB){
        int nbSwimmingPool = 0;
        
        for (Building b:arrayB){
            if (b.getClass().getName() == "Villa"){
                nbSwimmingPool++;
            }
        }
        
        return nbSwimmingPool;
    }
}
