package FirstAssessment;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;

        double newArmut,newElma,newDomates,newMuz,newPatlican;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        newArmut = scanner.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");

        newElma = scanner.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");

        newDomates = scanner.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");

        newMuz = scanner.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? : ");

        newPatlican = scanner.nextDouble();
        double toplam = armut*newArmut + elma*newElma + domates* newDomates + muz*newMuz + patlican*newPatlican;
        System.out.print("Toplam Tutar : " +toplam + " TL");
    }

}
