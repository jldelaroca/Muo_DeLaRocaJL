/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03_muo_delarocajl;

/**
 *
 * @author MUON
 */
public class Banana {
    private double banaLen;
    private String banaColor;
    
    public Banana() {
        banaLen = 6.0;
        banaColor = "green";
    }
    
    public void ripeBanana() {
        if (banaColor == "green") {
            banaColor = "yellow";
        } else {
            banaColor = "black";
        }
    }
}
