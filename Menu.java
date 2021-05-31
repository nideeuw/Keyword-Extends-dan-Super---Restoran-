/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtendsSuper;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Menu extends Restoran {
    String pilih;
    int jumlah;
    
    void Menu(int harga){
        System.out.println("    MENU RESTORAN NOODLES");
        System.out.println("- Mie Angel       Rp. "+harga);
        System.out.println("- Mie Setan       Rp. "+harga);
        System.out.println("- Mie Iblis       Rp. "+harga);
    }
    void Pilih(){
        Scanner input = new Scanner (System.in);
        System.out.println(" ");
        System.out.print("Pilihan Menu Anda: ");
        pilih = input.nextLine();
    }
    
}
