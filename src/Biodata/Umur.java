package Biodata;

/**
 *
 * @author Yusuf Isra
 */

//Class public dengan keyword extends yang diarahkah ke class Biodata (Biodata jadi Induk/Parent dari class ini)
public class Umur extends Biodata{
    //Method public void yang diberi nama data3 yang nantinya akan dipanggil di class Main
    public void data3(){
    //super.Umur = Mengambil semua source code yang ada pada method Umur (method Umur berada pada class Biodata)
    super.Umur();
    
    }
}
