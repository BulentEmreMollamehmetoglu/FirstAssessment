package FirstAssessment;

import java.util.Scanner;

public class KDV_Calculate {

    public static void main(String[] args) {

        double kdvsizFiyat,kdvTutari1=0.18,kdvTutari2=0.08,kdvliFiyat;

        Scanner scan=new Scanner(System.in);
        System.out.print("Urun fiyatini giriniz : ");
        kdvsizFiyat=scan.nextDouble();

        kdvliFiyat=kdvsizFiyat>0&kdvsizFiyat<1000?(kdvsizFiyat*kdvTutari1):(kdvsizFiyat*kdvTutari2);
        System.out.print("Girdiginiz urunun KDV'li tutari : "+(kdvliFiyat+kdvsizFiyat));



    }
}
