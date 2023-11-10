/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02_muo_delarocajl;

/**
 *
 * @author MUON
 */



public class EX02_Muo_DeLaRocaJL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banana bana1 = new Banana();
        Banana bana2 = new Banana();
        Banana bana3 = new Banana();
        Singer staceyRyan = new Singer();
        staceyRyan.favoriteSong = new Song();
        staceyRyan.performForAudience(12);
        staceyRyan.changeFavSong();
        System.out.println(staceyRyan.earnings + " " + staceyRyan.favoriteSong.songName);
    }
    
}
