package ThirdAssesment;

import java.util.Scanner;

public class CombinationCalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Enter value of n
        System.out.print("Enter n: ");
        int n = in.nextInt();

        //Enter value of r
        System.out.print("Enter r: ");
        int r = in.nextInt();

        //find nCr using the formula
        int combination  = factorial(n)/(factorial(n-r)*factorial(r));

        System.out.println("nCr: "+combination);

    }

    //function finds factorial of a number
    private static int factorial(int num){
        if(num==0 || num==1)
            return 1;

        int fact = 1;
        for(int i=2; i<=num; i++){
            fact = fact*i;
        }
        return fact;
    }
    }

