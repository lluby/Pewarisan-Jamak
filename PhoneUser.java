/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.praktikumpbo.projectphone;

/**
 *
 * @author Ervie Liana Luby 21103060
 */
public class PhoneUser {
    private InterfacePhone phone;
    
    public PhoneUser(InterfacePhone phone){
        this.phone = phone;
    }
    
    void turnOnPhone(){
        this.phone.powerOn();
    }
    
    void turnOffPhone(){
        this.phone.powerOff();
    }
    
    void makePhoneLouder(){
        this.phone.volumeUp();
    }
    
    void makePhoneSilent(){
        this.phone.volumeDown();
    }
}
