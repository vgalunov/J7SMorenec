package com.luxoft.vgalunov;

import java.util.Scanner;

/**
 * Java 7 SE training
 *
 * @author vgalunov
 */
public class J7SMorenec {

    /**
     * Return tasks numbers using first letter of student's last name
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Type your Last name:");
        Scanner sc = new Scanner(System.in);
        String lastName = sc.next();
        char firstLetter = lastName.charAt(0);
        int rest = firstLetter % 4;
        System.out.print("Tasks for " + lastName + ": ");
        if (rest == 0) {
            rest += 4;
        }
        for (int i = rest; i <= 56; i += 4) {
            System.out.print(i);
            if (i < 53) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }

}
