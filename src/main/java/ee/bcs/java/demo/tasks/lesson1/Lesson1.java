package ee.bcs.java.demo.tasks.lesson1;

import java.util.Scanner;
//as
// TODO kasuta if/else. Ära kasuta Math librarit
public class Lesson1 {
    public static void main(String[] args) {
        // Siia sisse võid sa kirjutada koodi, et testida kas su meetodid töötavad ilusti
        // Katseta IntelliJ shortcuti. Olles intelliJ kirjuta "sout" ja siis vajuta enter
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("sisesta 2 numbrit:");
        //int a  = scanner.nextInt();
        //int b  = scanner.nextInt();
        //System.out.println("Nendest numbrite miinimum on: " + min(a,b));
        //System.out.println(isEven(34));

    }

    // TODO tagasta a ja b väikseim väärtus
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    // TODO tagasta a ja b suurim väärtus
    public static int max(int a, int b) {
        if (a < b) {
            return b;
        } else {
            return a;
        }
    }

    // TODO tagasta a absoluut arv
    public static int abs(int a) {
        if (a < 0) {
            return a = -a;
        } else {
            return a = a;
        }

    }

    // TODO tagasta true, kui a on paaris arv
    // tagasta false kui a on paaritu arv
    public static boolean isEven(int a) {
        int b = a % 2;
        if (b == 0) {
            return true;
        } else
            return false;

    }

    // TODO tagasta kolmest arvust kõige väiksem
    public static int min3(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }

    // TODO tagasta kolmest arvust kõige suurem
    public static int max3(int a, int b, int c) {
        if (a >= b && a >= c){
            return a;
        }
        else if (b >= a && b >= c){
            return b;
        }
        else{
            return c;
        }
    }
}
