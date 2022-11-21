/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.praktikumpbo.projectphone;

/**
 *
 * @author Ervie Liana Luby 21103060
 */
import java.util.Scanner;

public class ProjectPhone {

    public static void main(String[] args) {
        InterfacePhone redmiNote8 = new Xiomi();
        InterfacePhone iPhone14 = new iPhone();
        InterfacePhone GalaxyZ = new Samsung();
        InterfacePhone Reno8 = new Oppo();
        PhoneUser dian = new PhoneUser(redmiNote8);
        PhoneUser dia = new PhoneUser(iPhone14);
        PhoneUser di = new PhoneUser(GalaxyZ);
        PhoneUser d = new PhoneUser(Reno8);
        Scanner input = new Scanner(System.in);
        int aksi;
        int pilihan;
        
        do{
            System.out.println("");
            System.out.println("APLIKASI INTERFACE");
            System.out.println("Pilihan Phone : ");
            System.out.println("[1] Xiomi");
            System.out.println("[2] iPhone");
            System.out.println("[3] Samsung");
            System.out.println("[4] Oppo");
            System.out.println("[0] Keluar");
            System.out.println("Silahkan Masukkan Pilihan Anda : ");
            pilihan = input.nextInt();
            System.out.println("");
            switch (pilihan){
                case 1  : 
                    do{
                        System.out.println("");
                        System.out.println("Xiomi");
                        System.out.println("[1] Nyalakan HP");
                        System.out.println("[2] Matikan Hp");
                        System.out.println("[3] Perbesar Volume");
                        System.out.println("[4] Kecilkan Volume");
                        System.out.println("[5] Ganti HP");
                        System.out.println("[0] Exit");
                        System.out.println("Masukkan Pilihan Anda : ");
                        aksi=input.nextInt();
                        switch (aksi){
                            case 1 :
                                dian.turnOnPhone();
                                break;
                            case 2 :
                                dian.turnOffPhone();
                                break;
                            case 3 :
                                dian.makePhoneLouder();
                                break;
                            case 4 :
                                dian.makePhoneSilent();
                                break;
                            case 0 :
                                System.exit(0);
                                break;
                            default :
                                System.out.println("");
                            }
                        }while(aksi != 5);
                        break;
                        
                case 2 :
                    do{
                        System.out.println("");
                        System.out.println("iPhone");
                        System.out.println("[1] Nyalakan HP");
                        System.out.println("[2] Matikan Hp");
                        System.out.println("[3] Perbesar Volume");
                        System.out.println("[4] Kecilkan Volume");
                        System.out.println("[5] Ganti HP");
                        System.out.println("[0] Exit");                        System.out.println("Masukkan Pilihan Anda : ");
                        aksi=input.nextInt();
                        switch (aksi){
                            case 1 :
                                dia.turnOnPhone();
                                break;
                            case 2 :
                                dia.turnOffPhone();
                                break;
                            case 3 :
                                dia.makePhoneLouder();
                                break;
                            case 4 :
                                dia.makePhoneSilent();
                                break;
                            case 0 :
                                System.exit(0);
                                break;
                            default :
                                System.out.println("");   
                            }
                        }while(aksi != 5);   
                        break;
            
                case 3 :
                    do{
                        System.out.println("");
                        System.out.println("Samsung");
                        System.out.println("[1] Nyalakan HP");
                        System.out.println("[2] Matikan Hp");
                        System.out.println("[3] Perbesar Volume");
                        System.out.println("[4] Kecilkan Volume");
                        System.out.println("[5] Ganti HP");
                        System.out.println("[0] Exit");
                        System.out.println("Masukkan Pilihan Anda : ");
                        aksi=input.nextInt();
                        switch (aksi){
                            case 1 :
                                di.turnOnPhone();
                                break;
                            case 2 :
                                di.turnOffPhone();
                                break;
                            case 3 :
                                di.makePhoneLouder();
                                break;
                            case 4 :
                                di.makePhoneSilent();
                                break;
                            case 0 :
                                System.exit(0);
                                break;
                            default :
                                System.out.println("");   
                            }
                        }while(aksi != 5);   
                        break;
                case 4 :
                    do{
                        System.out.println("");
                        System.out.println("Oppo");
                        System.out.println("[1] Nyalakan HP");
                        System.out.println("[2] Matikan Hp");
                        System.out.println("[3] Perbesar Volume");
                        System.out.println("[4] Kecilkan Volume");
                        System.out.println("[5] Ganti HP");
                        System.out.println("[0] Exit");
                        System.out.println("Masukkan Pilihan Anda : ");
                        aksi=input.nextInt();
                        switch (aksi){
                            case 1 :
                                d.turnOnPhone();
                                break;
                            case 2 :
                                d.turnOffPhone();
                                break;
                            case 3 :
                                d.makePhoneLouder();
                                break;
                            case 4 :
                                d.makePhoneSilent();
                                break;
                            case 0 :
                                System.exit(0);
                                break;
                            default :
                                System.out.println("");   
                            }
                        }while(aksi != 5);   
                        break;
                        
                case 0 :
                    System.exit(0);
                    break;
                    
                default :
                    System.out.println("Pilihan yang Anda Masukkan Salah");
            }
        }while(pilihan != 0);
    }
}
