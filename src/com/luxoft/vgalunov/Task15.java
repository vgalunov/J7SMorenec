package com.luxoft.vgalunov;

/**
 * Task15. Given positive integer number. Check the statement: "The number is
 * odd and three-digit"
 *
 * @author vgalunov
 */
public class Task15 {

    public static void main(String[] args) {
        int numb = 255;
        String s;
        if (numb % 2 == 1 && String.valueOf(numb).length() == 3) {
            s = " ";
        } else {
            s = " NOT ";
        }
        System.out.println("The number " + numb + " is" + s + "odd and three-digit.");
    }
}
