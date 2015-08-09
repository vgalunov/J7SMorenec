package com.luxoft.vgalunov;

/**
 * Task3. Given 3 variables - A,B,C. Replace their values - A to C, C to B, B to
 * A.
 *
 * @author sqr
 */
public class Task3 {

    public static void main(String[] args) {
        int A, B, C;
        A = 64;
        B = 512;
        C = 128;
        int d = A;
        A = B;
        B = C;
        C = d;
        System.out.println("A=" + A + " B=" + B + " C=" + C);
    }
}
