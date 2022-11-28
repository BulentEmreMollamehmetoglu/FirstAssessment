package ThirdAssesment;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        int n;
        int total = 0;
        Scanner inp = new Scanner(System.in);
        do{
            System.out.println("Sayı giriniz : ");
            n = inp.nextInt();
            if(n%2 == 1){
                total += n;
            }
        }while(n>0);
        System.out.println("Toplam : "+total);
    }
}
