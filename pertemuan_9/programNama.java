/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_9;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class programNama {
    public static void main(String[] args) {
        
        String namaMhs[] = new String[5];
        for (int i=0; i<namaMhs.length; i++){
            namaMhs[i] = JOptionPane.showInputDialog(null, "Imputkan Nama Mahasiswa ke " + i);
            System.out.println(namaMhs[i]);
        }
        
        String cariNama = JOptionPane.showInputDialog(null,"Cari Nama Mahasisawa");
        
        for(int i=0; i<namaMhs.length; i++){
            if(namaMhs[i].equals(cariNama)){
                JOptionPane.showInputDialog(null, "Nama yang anda cari adalah "+cariNama+ " ditemukan pada indeks ke "+i);
            }
        }
    }
}