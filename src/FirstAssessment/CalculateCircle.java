package FirstAssessment;

import java.util.Scanner;

public class CalculateCircle {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yarı çapını giriniz: ");
        r = input.nextInt();
        double square = pi *r*r;
        double perimeter = 2*pi*r;
        System.out.println("Dairenin alanı : " +square);
        System.out.println("Dairenin çevresi : " + perimeter);
    }

}
