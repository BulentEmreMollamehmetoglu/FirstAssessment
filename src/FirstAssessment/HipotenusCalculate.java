package FirstAssessment;

import java.util.Scanner;

public class HipotenusCalculate {
    public static void main(String[] args) {
        double perimeter;
        double a, b, c, areaOfTriangle;

        Scanner input = new Scanner(System.in);
        System.out.print("Edge A : ");
        a = input.nextDouble();
        System.out.print("Edge B : ");
        b = input.nextDouble();
        double hypotenuse = Math.sqrt((a*a) + (b*b));
        perimeter = (a+b+hypotenuse) /2; // half of perimeter
        areaOfTriangle = Math.sqrt(perimeter * (perimeter-a)* (perimeter-b)* (perimeter-hypotenuse));
        System.out.println("Hypotenuse is : " + hypotenuse);
        System.out.println("Area of triangle is : " + areaOfTriangle);

    }

}
