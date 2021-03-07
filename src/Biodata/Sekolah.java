package Biodata;

/**
 *
 * @author Yusuf Isra
 */

//Class public dengan keyword extends yang diarahkah ke class Biodata (Biodata jadi Induk/Parent dari class ini)
public class Sekolah extends Biodata{
    //Method public void yang diberi nama data4 yang nantinya akan dipanggil di class Main
    public void data4(){
    //super.Sekolah = Mengambil semua source code yang ada pada method Sekolah (method Sekolah berada pada class Biodata)
    super.Sekolah();
    
    }
}
