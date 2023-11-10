/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01_muo_delarocajl;

/**
 *
 * @author MUON
 */
public class EX01_Muo_DeLaRocaJL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String tab1Shape = "circle";
        int tab1Legs = 1;
        double tab1Area = 5.5;
        String tab2Shape = "square";
        int tab2Legs = 4;
        double tab2Area = 12.25;
        String tab3Shape = "circle";
        int tab3Legs = 3;
        double tab3Area = 11.75;
        int totalLegs = tab1Legs + tab2Legs + tab3Legs;
        double totalArea = tab1Area + tab2Area + tab3Area;
        boolean tab1_2LegsGreater = tab1Legs > tab2Legs;
        System.out.println("Table 1\nShape: " + tab1Shape);
        System.out.println("Number of Legs: " + tab1Legs);
        System.out.println("Area: " + tab1Area + "ft\n");
        System.out.println("Table 2\nShape: " + tab2Shape);
        System.out.println("Number of Legs: " + tab2Legs);
        System.out.println("Area: " + tab2Area + "ft\n");
        System.out.println("Table 3\nShape: " + tab3Shape);
        System.out.println("Number of Legs: " + tab3Legs);
        System.out.println("Area: " + tab3Area + "ft\n");
        System.out.println("Total Amount of Legs: " + totalLegs);
        System.out.println("Total Area: " + totalArea);
        System.out.println("Table 1 has more legs than Table 2: " + tab1_2LegsGreater);
    }
    
}
