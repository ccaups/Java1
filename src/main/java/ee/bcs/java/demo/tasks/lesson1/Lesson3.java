package ee.bcs.java.demo.tasks.lesson1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Lesson3 {
    public static void main(String[] args) {
        //factorial(5);
        //System.out.println(reverseString("tere"));
        //System.out.println(isPrime(3));
        //System.out.println(isPrime(217));
        //sort(new int[]{6, 2, 7, 3, 1});
        //evenFibonacci(40);
        //morseCode("sos  ");

    }

    // TODO tagasta x faktoriaal.
    // Näiteks
    // x = 5
    // return 5*4*3*2*1 = 120
    public static int factorial(int x) {
        int sum = 1;
        for (int y = x; y > 0; y--) {
            sum = sum * y;
        }
        return sum;
    }

    // TODO tagasta string tagurpidi
    public static String reverseString(String a) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] masiiv = a.toCharArray();
        char[] newchar = new char[a.length()];
        int j = 0;
        for (int i = masiiv.length - 1; i >= 0; i--) {
            stringBuilder.append(newchar[j] = masiiv[i]);
            j++;
        }
        String joinedString = stringBuilder.toString();
        return joinedString;
    }

    // TODO tagasta kas sisestatud arv on primaar arv (jagub ainult 1 ja iseendaga)
    public static boolean isPrime(int x) {
        boolean isPrime = false;
        if (x > 1) {
            isPrime = true;
            for (int i = 2; i <= x / 2; ++i) {
                if (x % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }

    // TODO sorteeri massiiv suuruse järgi.
    // TODO kasuta tsükleid, ära kasuta ühtegi olemasolevat sort funktsiooni
    public static int[] sort(int[] a) {
        int[] result = a;
        for (int i = 0; i < result.length; i++) {
            for (int j = i + 1; j < result.length; j++) {
                int tmp = 0;
                if (result[i] > result[j]) {
                    tmp = result[i];
                    result[i] = result[j];
                    result[j] = tmp;
                }
            }
        }
        ///System.out.println(Arrays.toString(result));
        return result;
    }

    // TODO liida kokku kõik paaris fibonacci arvud kuni numbrini x
    public static int evenFibonacci(int x) {
        int f[] = new int[x + 2];
        int sum_evenf = 0;
        int arv = 2;
        f[0] = 0;
        f[1] = 1;
        //System.out.println("0: "+f[0]); /test
        //System.out.println("1: "+f[1]);  /test
        for (int i = 2; i <= x; i++) {
            f[i] = f[i - 1] + f[i - 2];
            //System.out.println(arv+": "+f[i]); /test
            //arv++;
            if (f[i] % 2 == 0) {
                //System.out.println(f[i] + " on paaris arv." ); /test
                if (f[i] <= x && f[i] > 0) {
                    sum_evenf = sum_evenf + f[i];
                    //System.out.println("loeb :"+f[i]); /test
                }
            }
        }
        System.out.println(sum_evenf);
        return sum_evenf;
    }

    // TODO kirjuta programm, mis tagastab sisestatud teksti morse koodis (https://en.wikipedia.org/wiki/Morse_code)
    // Kasuta sümboleid . ja - ning eralda kõik tähed tühikuga
    public static String morseCode(String text) {
        return morseCodeCore(text);
    }

    public static String morseCodeCore(String text) {
        Map<String, String> testMap = new HashMap<>();
        testMap.put("a", ".-");
        testMap.put("b", "-...");
        testMap.put("c", "-.-.");
        testMap.put("d", "-..");
        testMap.put("e", ".");
        testMap.put("f", "..-.");
        testMap.put("g", "--.");
        testMap.put("h", "....");
        testMap.put("i", "..");
        testMap.put("j", ".---");
        testMap.put("k", "-.-");
        testMap.put("l", ".-..");
        testMap.put("m", "--");
        testMap.put("n", "-.");
        testMap.put("o", "---");
        testMap.put("p", ".--.");
        testMap.put("q", "--.-");
        testMap.put("r", ".-.");
        testMap.put("s", "...");
        testMap.put("t", "-");
        testMap.put("u", "..-");
        testMap.put("v", "...-");
        testMap.put("w", ".--");
        testMap.put("x", "-..-");
        testMap.put("y", "-.--");
        testMap.put("z", "--..");
        testMap.put(" ", "xx");
        StringBuilder stringBuilder = new StringBuilder();
        char[] masiivTxt = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            String temp = Character.toString(masiivTxt[i]);
            if (i+1 < text.length()){
                String tempcheck = Character.toString(masiivTxt[i+1]);
                if (testMap.get(tempcheck) == "xx"){
                    if (testMap.get(temp) == "xx") {
                        System.out.println();
                        //System.out.println("if-if-if");
                    }
                    else{
                        String temp1 = testMap.get(temp);
                        stringBuilder.append(temp1);
                        //System.out.println("if-if-else :" + temp1);
                    }
                }
                else{
                    String temp1 = testMap.get(temp) + " ";
                    stringBuilder.append(temp1);
                    //System.out.println("if-else :"+temp1);
                }
            }
            else{
                if (testMap.get(temp) == "xx"){
                    System.out.println();
                    //System.out.println("else-if");
                }
                else{
                    String temp1 = testMap.get(temp);
                    stringBuilder.append(temp1);
                    //System.out.println("else-else :" + temp1);
                }
            }
        }
        String joinedString = stringBuilder.toString();
        System.out.println(joinedString);
        return joinedString;
    }
}
