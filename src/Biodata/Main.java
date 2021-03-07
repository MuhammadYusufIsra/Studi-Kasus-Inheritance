package Biodata;

/**
 *
 * @author Yusuf Isra
 */

//Class Main
public class Main {
    //Method main
    public static void main(String[] args){
        //Membuat objek
        Biodata data = new Biodata();
        //memanggil data dari class lain melewati objek yang sudah dibuat
        data.data1();//data untuk menampilkan judul (di ambil dari class biodata)
        Nama nama = new Nama();
        nama.data2();//data untuk menampilkan nama (diambil dari class Nama)
        Umur umur = new Umur();
        umur.data3();//data untuk menampilkan umur (diambil dari class Umur)
        Sekolah sekolah = new Sekolah();
        sekolah.data4();//data untuk menampilkan nama sekolah (diambil dari class Sekolah)
        
    }
    //Method void yang nantinya akan dijadikan bahan keyword super di class Biodata dan untuk class Main ini sendiri
        void halo(){ //method void yang bernama halo
            
            //Mencetak judul
        System.out.println(">>>>> BIODATA SISWA <<<<<");
    }

}

