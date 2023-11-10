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
public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    boolean songSwitch;
    
    public void performForAudience(int numPeople) {
        noOfPerformances += 1;
        System.out.println(earnings);
        earnings += numPeople * 100;
        System.out.println(earnings);
    }
    
    public void changeFavSong() {
    
        if (songSwitch) {
            favoriteSong.songName = "Over Tonight";
            songSwitch = false;
        } else {
            favoriteSong.songName = "Fall In Love Alone";
            songSwitch = true;
        }
    }
    
    public Singer() {
        name = "Stacey Ryan";
        noOfPerformances = 0;
        earnings = 0;
        songSwitch = true;
    }
}
