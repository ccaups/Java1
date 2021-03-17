package ee.bcs.java.demo.tasks.lesson1;

import java.util.Arrays;

public class Lesson2c {

    public static void main(String[] args) {
        System.out.println("while");
        yl1(5);
        System.out.println("");
        yl1(0);
        System.out.println("");
        yl1(-3);
        System.out.println("\nlop");
        yl2(5);
        System.out.println("");
        yl2(0);
        System.out.println("");
        yl2(-3);
        System.out.println("");
        System.out.println(Arrays.toString(yl3(5)));
    }

    // TODO
    // trükkida välja numbrid n-ist 0-ini
    // Näiteks: sisend: 5
    // Väljund: 5, 4, 3, 2, 1, 0
    // Näide2: siend: -3
    // Väljund: -3, -2, -1, 0
    // Kasuta while loopi
    public static void yl1(int n) {
        if (n > 0) {
            while (n >= 0) {
                System.out.print(n + " ");
                n--;
            }
        } else if (n < 0) {
            while (n < 1) {
                System.out.print(n + " ");
                n++;
            }
        } else {
            System.out.print(n);
        }
    }

    // TODO
    // sama sisu nagu yl1
    // Kasuta for loopi
    public static void yl2(int n) {
        if (n > 0) {
            for (int i = 0; i <= n; n--) {
                System.out.print(n + " ");
            }
        }
        else if (n < 0) {
            for (int i = 0; i >= n; n++) {
                System.out.print(n + " ");
            }
        }
        else {
            System.out.print(n);
        }
    }

    // TODO
    // tagasta massiiv pikkusega n, mille kõigi elementide väärtused on 3
    public static int[] yl3(int n) {
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = 3;
        }
        return x;
    }
}
