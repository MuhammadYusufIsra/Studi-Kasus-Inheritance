/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biodata;

/**
 *
 * @author Yusuf Isra
 */
public class Main {
    public static void main(String[] args){
        Biodata data = new Biodata();
        data.data1();
        Nama nama = new Nama();
        nama.data2();
        Umur umur = new Umur();
        umur.data3();
        Sekolah sekolah = new Sekolah();
        sekolah.data4();
        
    }
        void halo(){
        System.out.println(">>>>> BIODATA SISWA <<<<<");
    }

}

