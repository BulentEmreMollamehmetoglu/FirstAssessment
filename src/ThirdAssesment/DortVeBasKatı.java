package ThirdAssesment;

import java.util.Scanner;

public class DortVeBasKatı {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int sayi = inp.nextInt();
        for(int i = 1; i <= sayi; i*=4){
            System.out.println("4'ün Kuvvetleri = " + i);
        }
        for(int i = 1; i <=sayi; i*=5){
            System.out.println("5'in Kuvvetleri = " + i);
        }
    }
}
