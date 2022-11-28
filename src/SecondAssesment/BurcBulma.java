package SecondAssesment;

import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        int month,day;

        Scanner input = new Scanner(System.in);

        System.out.println("Doğduğunuz ay : ");
        month = input.nextInt();

        System.out.println("Doğduğunuz gün : ");
        day = input.nextInt();

        switch (month){
            case 1:
                if(day >=1 && day <=31){
                    if(day<22){
                        System.out.println("Oğlak burcu");
                    }else{
                        System.out.println("Kova burcu");
                    }
                }else{
                    System.out.println("Geçersiz");
                }


            case 2:
                if(day >=1 && day <=28){
                    if(day<20){
                        System.out.println("Kova burcu");
                    }else{
                        System.out.println("Balık burcu");
                    }
                }else{
                    System.out.println("Geçersiz");
                }

                break;

            case 3:
                if(day >=1 && day<=31){
                    if(day <21){
                        System.out.println("Balık burcu");
                    }else{
                        System.out.println("Koç burcu");
                    }
                }else{
                    System.out.println("Geçersiz");
                }
            default:
                System.out.println("Hatalı ay!");
        }
    }

}
