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
public class Singer {
    static int totalPerformances = 0;
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    private boolean songSwitch;
    
    public void performForAudience(int numPeople) {
        noOfPerformances += 1;
        earnings += numPeople * 100;
        
        System.out.println(name + " performed to " + numPeople + " audiences.");
    }
    
    public void performForAudience(int numPeople, Singer partner) {
        noOfPerformances += 1;
        totalPerformances += 1;
        double splitProfs = numPeople * 100 / 2;
        earnings += splitProfs;
        
        partner.setPerfs(partner.getPerfs()+1);
        partner.setEarns(partner.getEarnings()+splitProfs);
        
        System.out.println(name + " and " + partner.getName() + " performed to " + numPeople + " audiences.");
        System.out.println("They both earned " + splitProfs);
        System.out.println("There are a total of " + totalPerformances + " performances.");
    }
    
    public void changeFavSong() {
    
        if (songSwitch) {
            favoriteSong.changeName("Over Tonight");
            songSwitch = false;
        } else {
            favoriteSong.changeName("Fall In Love Alone");
            songSwitch = true;
        }
        
        System.out.println(name + "'s favorite song has been changed to " + getFavSong() + '.');
    }
    
    public String getFavSong() {
        return favoriteSong.getName();
    }
    
    public double getEarnings() {
        return earnings;
    }
    
    public int getPerfs() {
        return noOfPerformances;
    }
    
    public String getName() {
        return name;
    }
    
    public void setPerfs(int perfs) {
        noOfPerformances = perfs;
    }
    
    public void setEarns(double earns) {
        earnings = earns;
    }
    
    public Singer() {
        name = "Stacey Ryan";
        noOfPerformances = 0;
        earnings = 0.0;
        songSwitch = true;
    }
    
    public void iniFav(Song newSong) {
        favoriteSong = newSong;
    }
}
