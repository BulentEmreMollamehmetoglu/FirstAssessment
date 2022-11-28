package ThirdAssesment;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int randomNum;
        Scanner scanner = new Scanner(System.in);
        randomNum = scanner.nextInt();
        int randomNumDigits = randomNum+ "".length();
        int sum = 0;
        for(int i=0;i<randomNumDigits;i++){
            sum += randomNum%10;
            randomNum = randomNum/10;
        }
        System.out.println(sum);
    }
}
