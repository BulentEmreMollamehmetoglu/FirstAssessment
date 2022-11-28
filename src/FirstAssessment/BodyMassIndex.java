package FirstAssessment;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        float height;
        int weight;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        height = scanner.nextFloat();
        System.out.println("Lütfen kilonuzu giriniz : ");
        weight = scanner.nextInt();
        double bodyMassIndex = weight / (height*height);
        System.out.println("Vücut Kitle İndeksiniz : " + bodyMassIndex );
    }


}


