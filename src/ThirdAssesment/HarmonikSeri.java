package ThirdAssesment;

import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        int number;
        double total=0;


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayi giriniz:");
        number = scan.nextInt();

        for (double i = 1; i <= number; i++) {

            total += 1 / i;
        }
        System.out.println(total);
    }

}


