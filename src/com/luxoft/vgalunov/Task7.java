package com.luxoft.vgalunov;

import java.util.Scanner;

/**
 * Task7. Given value of temperature in Celsius. Convert it to Fahrenheit.
 * TC=(TF–32)·5/9 TF=TC·9/5+32
 *
 * @author vgalunov
 */
public class Task7 {

    public static void main(String[] args) {
        System.out.println("Type temperature in Celsius:");
        Scanner sc = new Scanner(System.in);
        String ctemp = sc.next();
        int ftemp = Integer.valueOf(ctemp) * 9 / 5 + 32;
        System.out.println("Temperature in Fahrenheit:" + ftemp);
    }
}
