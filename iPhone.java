/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.praktikumpbo.projectphone;

import static edu.praktikumpbo.projectphone.InterfacePhone.MAX_VOLUME;
import static edu.praktikumpbo.projectphone.InterfacePhone.MIN_VOLUME;

/**
 *
 * @author Ervie Liana Luby 21103060
 */
public class iPhone implements InterfacePhone {
    private int volume;
    private boolean isPowerOn;
    
    public iPhone(){
        this.volume = 50;
    }
    
    public void powerOn(){
        isPowerOn = true;
        System.out.println("Handphone Menyala....");
        System.out.println("Hello");
    }
    
    public void powerOff(){
        isPowerOn = false;
        System.out.println("Handphone Dimatikan");
    }
    
    public int getVolume(){
        return this.volume;
    }
    
    public void volumeUp(){
        if(isPowerOn){
            if(this.volume == MAX_VOLUME){
                System.out.println("Volume Full!!");
                System.out.println("Sudah "+this.getVolume());
            }else{
                this.volume += 10;
                System.out.println("Volume sekarang : "+this.getVolume());
            }
        }else{
            System.out.println("Silahkan Nyalakan Handphone Anda...");
        }
    }
    
    public void volumeDown(){
        if(isPowerOn){
            if(this.volume == MIN_VOLUME){
                System.out.println("Volume = 0");
            }else{
                this.volume -= 10;
                System.out.println("Volume Sekarang : "+this.getVolume());
            }
        }else{
            System.out.println("Silahkan Nyalakan Handphone Anda...");
        }
    }
}

