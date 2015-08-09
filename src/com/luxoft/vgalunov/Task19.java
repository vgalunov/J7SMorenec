package com.luxoft.vgalunov;

/**
 * Task19. Given coordinates of chess table - x1, y1, x2, y2. Check the
 * statement: "Rook is able to cross the field to opposite side"
 *
 * @author vgalunov
 */
public class Task19 {

    public static void main(String[] args) {
        int x1 = 1;
        int y1 = 8;
        int x2 = 3;
        int y2 = 5;
        String pos1;
        String pos2;
        if (y1<=4){
            pos1="bottom";
        } else {
            pos1="top";
        }
        if (y2<=4){
            pos2="bottom";
        } else {
            pos2="top";
        }
        if(pos1.equals(pos2)){
            System.out.println("Rook is NOT able to cross the field to opposite side");
        } else {
           System.out.println("Rook is able to cross the field to opposite side"); 
        }
    }
}
