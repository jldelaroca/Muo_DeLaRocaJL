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



public class EX03_Muo_DeLaRocaJL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banana bana1 = new Banana();
        Banana bana2 = new Banana();
        Banana bana3 = new Banana();
        Singer staceyRyan = new Singer();
        Singer ryanStacey = new Singer();
        staceyRyan.iniFav(new Song());
        staceyRyan.performForAudience(12);
        staceyRyan.changeFavSong();
        System.out.println(staceyRyan.getName() + " currently has " + staceyRyan.getEarnings() + " earnings with a favorite song titled " + staceyRyan.getFavSong() + '.');
        staceyRyan.performForAudience(20,ryanStacey);
    }
    
}
