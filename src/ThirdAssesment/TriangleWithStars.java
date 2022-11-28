package ThirdAssesment;

import java.util.Scanner;

public class TriangleWithStars {
    public static void main(String[] args) {
        Scanner getRow=new Scanner(System.in);
        System.out.print("satır sayısı giriniz : ");
        int rowNum=getRow.nextInt();
        int midle=(rowNum-1),initial=1;
        for(int d=1;d<=(rowNum*2-1);d++) {
            for (int i = 1; i <= midle; i++) {
                System.out.print(" ");
            }

            for(int stars=1;stars<=initial;stars++){
                System.out.print("*");
            }
            if(d<rowNum) {
                initial = d * 2 + 1;
                midle--;
            }
            else {
                initial -= 2;
                midle++;
            }

            System.out.println();
        }
    }
}
