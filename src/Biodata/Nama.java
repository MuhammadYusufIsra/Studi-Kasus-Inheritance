package Biodata;

/**
 *
 * @author Yusuf Isra
 */

//Class public dengan keyword extends yang diarahkah ke class Biodata (Biodata jadi Induk/Parent dari class ini)
public class Nama extends Biodata{
    //Method public void yang diberi nama data2 yang nantinya akan dipanggil di class Main
    public void data2(){
    //super.namaee = Mengambil semua source code yang ada pada method namaee (method namaee berada pada class Biodata)
    super.namee();
        }


}
