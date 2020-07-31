/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayMultidimensi;


import javax.swing.JOptionPane;


public class Data_keluarga {
    public static void main(String[] args) {
       
        System.out.println("Array 2 dimensi untuk String");
        System.out.println("=====Data Keluarga=====");
        String agkeluarga[][] = {{"1", "Hadi Sunarto"}, {"2", "Siti Masri'ah"}, {"3", "Siti Nikmatul Hidayah"},{"4", "Muhammad Syukron"},{"5", "Moh. Fuad Hamdani"}};
       
         
        for (int i = 0; i < agkeluarga.length; i++) {
            for (int j = 0; j < agkeluarga[0].length; j++) {
                System.out.print(agkeluarga[i][j] + " ");
            }
            System.out.println(" ");
        }
        String cari = JOptionPane.showInputDialog(null,"  Cari Data agkeluarga Berdasarkan NO urut");
        for (int i =0; i< agkeluarga.length; i++ ){
            for (int j =0; j < agkeluarga[0].length; j++){
                if(agkeluarga[i][j].equals(cari)){
                    JOptionPane.showMessageDialog(null, "agkeluarga dengan Nomor Urutan " + cari + " Ditemukan bernama " + agkeluarga[i][j+1]);
                }
                System.out.print(agkeluarga[i][j] + " ");
            }
            System.out.println(" ");
        }
          for (int i = 0; i < agkeluarga.length; i++) {
            for (int j = 0; j < agkeluarga[0].length; j++) {
                System.out.print(agkeluarga[i][j] + " ");
            }
            System.out.println(" ");
          }
    
        }
    }
