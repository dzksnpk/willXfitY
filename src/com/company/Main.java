package com.company;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int z1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int z2 = sc.nextInt();

        int smallest1 = Math.min(x1, Math.min(y1, z1));
        int smallest2 = Math.min(x2, Math.min(y2, z2));

        int median1 = Math.max(Math.min(x1, y1), Math.min(Math.max(x1, y1), z1));
        int median2 = Math.max(Math.min(x2, y2), Math.min(Math.max(x2, y2), z2));

        int biggest1 = Math.max(x1, Math.max(y1, z1));
        int biggest2 = Math.max(x2, Math.max(y2, z2));

        if (smallest1 < smallest2 || biggest1 < biggest2) {
            if (smallest1 <= smallest2 && median1 <= median2 && biggest1 <= biggest2) {
                System.out.println("Box 1 < Box 2");
            } else {
                System.out.println("Incomparable");
            }
        } else if (smallest1 == smallest2 && biggest1 == biggest2) {
            System.out.println("Box 1 = Box 2");
        } else {
            System.out.println("Box 1 > Box 2");
        }
    }
}

