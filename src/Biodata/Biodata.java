package Biodata;

/**
 *
 * @author Yusuf Isra
 */

//Class Biodata yang menggunakan keyword extends (Inheritance) yang diarahkan ke class Main (Jadi class Main dianggap Induk)
public class Biodata extends Main{
    //Deklarasi variabel (instance)
    String nama;
    String sekolah;
    int umur;
//method sebagai wadah keyword super.halo
public void data1(){
//super.halo = Mengambil semua source code yang ada pada method halo (method halo berada pada class main)
super.halo();
        }
            
    //Method void yang nantinya akan dijadikan bahan keyword super di class Nama yang nanti akan dipanggil lagi ke class Main
    void name(){
        //Menentukan nama dan mencetak (tetapi masih belum bisa tercetak ketika dirun, harus di panggil di class main
    this.nama = "Muhammad Yusuf Isra";
    System.out.println("Nama : "+nama);
    }
    //Method void yang nantinya akan dijadikan bahan keyword super di class Umur yang nanti akan dipanggil lagi ke class Main
    void Umur(){
        //Menentukan umur dan mencetak (tetapi masih belum bisa tercetak ketika dirun, harus di panggil di class main
    this.umur = 16;
    System.out.println("Umur : "+umur);
    }
    //Method void yang nantinya akan dijadikan bahan keyword super di class Sekolah yang nanti akan dipanggil lagi ke class Main
    void Sekolah(){
        //Menentukan nama Sekolah murid dan mencetak (tetapi masih belum bisa tercetak ketika dirun, harus di panggil di class main
    this.sekolah = "SMK TELKOM MALANG";
    System.out.println("Sekolah : "+sekolah);
    }
}
