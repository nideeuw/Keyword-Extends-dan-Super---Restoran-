/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtendsSuper;

/**
 *
 * @author MOKLET-2
 */
public class Restoran {
    int harga = 15000;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu mie = new Menu();
        mie.Menu(15000);
        mie.Pilih();
        
        Transaksi proses = new Transaksi();
        proses.Transaksi();
        
    }
    
    void Nota(){
        System.out.println(" ");
        System.out.println("===============================");
        System.out.println("    NOTA PEMBELIAN NOODLES");
        System.out.println(" ");
    }
}
