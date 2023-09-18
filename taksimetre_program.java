// kütüphane eklenimi
import java.util.Scanner;
public class taksimetre_program {

    public static void main(String[] args) {
        // Verileri tutumak için kullanılan veri tipleri 
        int km;
        double perkm = 2.20 , total , startprice=10;
        // kullanıcıdan veri alma 
        Scanner giris = new Scanner(System.in);
        System.out.println("MESAFEYİ KM CİNSİNDEN GİRİNİZ : ");
        km = giris.nextInt();
        // operatörler ile hesaplama
        total = (km + perkm);

        total +=startprice;

       total = (total < 20) ? 20 : total ;
        // ekrana bastırma 
       System.out.println("TOPLAM TUTAR : " +  total);
       
        


    }
    
}