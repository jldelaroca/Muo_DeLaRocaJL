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
public class Song {
    private String songName;
    
    public void changeName(String newName) {
        songName = newName;
    }
    
    public String getName() {
        return songName;
    }
    
    public Song() {
        songName = "Fall In Love Alone";
    }
}
