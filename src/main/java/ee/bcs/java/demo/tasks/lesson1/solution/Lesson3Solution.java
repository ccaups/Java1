package ee.bcs.java.demo.tasks.lesson1.solution;

public class Lesson3Solution {

    // TODO tagasta x faktoriaal.
    // Näiteks
    // x = 5
    // return 5*4*3*2*1 = 120
    public static int factorial(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    // TODO tagasta string tagurpidi
    public static String reverseString(String a) {
        return "";
    }

    // TODO tagasta kas sisestatud arv on primaar arv (jagub ainult 1 ja iseendaga)
    public static boolean isPrime(int x) {
        return false;
    }

    // TODO sorteeri massiiv suuruse järgi.
    // TODO kasuta tsükleid, ära kasuta ühtegi olemasolevat sort funktsiooni
    public static int[] sort(int[] a) {
        return new int[0];
    }

    public static int evenFibonacci(int x) {
        // TODO liida kokku kõik paaris fibonacci arvud kuni numbrini x
        return 0;
    }

    public static String morseCode(String text) {
        // TODO kirjuta programm, mis tagastab sisestatud teksti morse koodis (https://en.wikipedia.org/wiki/Morse_code)
        // Kasuta sümboleid . ja - ning eralda kõik tähed tühikuga
        return "";
    }
}
