package ee.bcs.java.demo.tasks.lesson1;

import java.util.Arrays;

public class Lesson2 {

    public static void main(String[] args) {
        //int[] sisend = {2, 4, 5, -2, -1};
        //System.out.println(min(sisend));
        //System.out.println(max(sisend));
        //System.out.println(sum(sisend));
        //System.out.println(Arrays.toString((reverseArray(new int[]{1, 2, 3, 4}))));
        //System.out.println(Arrays.toString((evenNumbers(6))));
        //multiplyTable(4,4);
        //System.out.println(fibonacci(2));
        //sequence3n(100, 200);34, 55
        //evenNumbers(15);
        //fibonacci(15);
        // TODO siia saab kirjutada koodi testimiseks
    }

    // TODO loe funktsiooni sisendiks on täisarvude massiiv
    // TODO tagasta massiiv mille elemendid on vastupidises järiekorras
    public static int[] reverseArray(int[] inputArray) {
        int n = inputArray.length;
        for (int i = 0; 0 < n; n--) {
            inputArray[i] = n;
            i++;
        }
        return inputArray;
    }

    // TODO tagasta massiiv mis sisaldab n esimest paaris arvu
    // Näide:
    // Sisend 5
    // Väljund 2 4 6 8 10
    public static int[] evenNumbers(int n) {
        int[] x = new int[n];
        x[0] = 2;
        for (int i = 1; i < n; i++) {
            //System.out.println(i);
            x[i] = x[i - 1] + 2;
        }
        return x;
    }

    // TODO, leia massiivi kõige väiksem element
    public static int min(int[] x) {
        int minimumNumber = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] < minimumNumber) {
                minimumNumber = x[i];
            }
        }
        return minimumNumber;
    }

    // TODO, leia massiivi kõige suurem element
    public static int max(int[] x) {
        int maximumNumber = x[0];
        for (int i = 0; i < x.length; i++) {
            if (x[i] > maximumNumber) {
                maximumNumber = x[i];
            }
        }
        return maximumNumber;
    }

    // TODO, leia massiivi kõigi elementide summa
    public static int sum(int[] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum = sum + x[i];
        }
        return sum;
    }

    // TODO trüki välja korrutustabel mis on x ühikut lai ja y ühikut kõrge
    // TODO näiteks y = 3x = 3
    // TODO väljund
    // 1 2 3
    // 2 4 6
    // 3 6 9
    // TODO 1 trüki korrutustabeli esimene rida (numbrid 1 - x)
    // TODO 2 lisa + " " print funktsiooni ja kasuta print mitte println
    // TODO 3 trüki seda sama rida y korda
    // TODO 4 Kuskile võiks kirjutada System.out.println(),
    //  et saada taebli kuju
    // TODO 5 võrdle ridu. Kas on mingi seaduspärasus ridade vahel,
    // mis on ja mis võiks olla. Äkki tuleb mõni idee
    public static void multiplyTable(int x, int y) {
        for (int a = 1; a <= x; ++a) {
            for (int b = 1; b <= y; ++b) {
                System.out.printf("%4d", (a * b));
            }
            System.out.println();
        }
    }

    // TODO
    // Fibonacci jada on fib(n) = fib(n-1) + fib(n-2);
    // 0, 1, 1, 2, 3, 5, 8, 13, 21
    // Tagasta fibonacci jada n element. Võid eeldada, et n >= 0
    public static int fibonacci(int n) {
        int f[] = new int[n + 2];
        f[0] = 0;
        f[1] = 1;
        int a = 2;
        System.out.println("0: "+f[0]);
        System.out.println("1: "+f[1]);
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
            System.out.println(a+": "+f[i]);
            a++;
        }
        return f[n];
    }

    // TODO
    // Kujutame ette numbrite jada, kus juhul kui number on paaris arv siis me jagame selle 2-ga
    // Kui number on paaritu arv siis me korrutame selle 3-ga ja liidame 1. (3n+1)
    // Seda tegevust teeme me niikaua kuni me saame vastuseks 1
    // Näiteks kui sisend arv on 22, siis kogu jada oleks:
    // 22 -> 11 -> 34 -> 17 -> 52 -> 26 -> 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
    // Sellise jada pikkus on 16
    // Kirjutada programm, mis peab leidma kõige pikema jada pikkuse mis jääb kahe täis arvu vahele
    // Näiteks:
    // Sisend 1 10
    // Siis tuleb vaadata, kui pikk jada tuleb kui esimene numbr on 1. Järgmisen tuleb arvutada number 2 jada pikkus.
    // jne. kuni numbrini 20
    // Tagastada tuleb kõige pikem number
    // Näiteks sisendi 1 ja 10 puhul on vastus 20

    public static int sequence3n(int x, int y) {
        int b = 0;
        for (int i = x; i <= y; i++) {
            int a = 1;
            x = i;
            for (int n = 1; x > 1; n++) {
                System.out.print(x+" ");
                if (x % 2 == 0) {
                    x = x / 2;
                    a++;
                }
                else {
                    x = x * 3;
                    x++;
                    a++;

                }
            }
            System.out.print(x);
            System.out.println(" Kokku pikkus : "+ a);
            if (a > b) {
                b = a;
            }
            else {
                System.out.print("");
            }
            System.out.println("_____________________________");
        }
        System.out.println("Kõige pikem pikkus on "+ b);
        System.out.println(" ");
        return b;
    }
}
