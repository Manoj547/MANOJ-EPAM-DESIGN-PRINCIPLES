package org.epam3;

import org.epam3.mainCalc.*;

import java.util.*;

public class App 
{
    public static void main( final String[] args) {
        final Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        final float fnum = sc.nextFloat();

        System.out.println("Enter operation to be performed : ");
        final char operate = sc.next().charAt(0);

        System.out.println("Enter second number : ");
        final float snum = sc.nextFloat();

        final mainCalc calculate = new mainCalc(fnum, operate, snum);
        System.out.println("Result is "+ calculate.displayResult());
    }
}
