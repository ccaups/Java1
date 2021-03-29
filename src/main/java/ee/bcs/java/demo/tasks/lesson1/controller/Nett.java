package ee.bcs.java.demo.tasks.lesson1.controller;

import ee.bcs.java.demo.tasks.lesson1.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Nett {

    // http://localhost:8080/lesson1/min/{x}/{y}
    @GetMapping("lesson1/min/{x}/{y}")
    public static int min(@PathVariable("x") int a, @PathVariable("y") int b){
        return Lesson1.min(a,b);
    }

    // http://localhost:8080/lesson1/max/{x}/{y}
    @GetMapping("lesson1/max/{x}/{y}")
    public static int max(@PathVariable("x") int a, @PathVariable("y") int b) {
        return Lesson1.max(a,b);
    }

    // http://localhost:8080/lesson1/abs/{x}
    @GetMapping("lesson1/abs/{x}")
    public static int abs(@PathVariable("x") int a) {
        return Lesson1.abs(a);
    }

    // http://localhost:8080/lesson1/isEven/{x}
    @GetMapping("lesson1/isEven/{x}")
    public static boolean isEven(@PathVariable("x") int a) {
        return Lesson1.isEven(a);
    }

    // http://localhost:8080/lesson1/min3/{x}/{y}/{z}
    @GetMapping("lesson1/min3/{x}/{y}/{z}")
    public static int min3(@PathVariable("x") int a, @PathVariable("y") int b
    ,@PathVariable("z") int c) {
        return Lesson1.min3(a, b, c);
    }

    // http://localhost:8080/lesson1/max3/{x}/{y}/{z}
    @GetMapping("lesson1/max3/{x}/{y}/{z}")
    public static int max3(@PathVariable("x") int a, @PathVariable("y") int b
            ,@PathVariable("z") int c) {
        return Lesson1.max3(a, b, c);
    }
    //http://localhost:8080/lesson1/reverseArray/{x}
    @GetMapping("lesson2/reverseArray/{x}")
    public static int[] reverseArray(@PathVariable("x") int[] a) {
        return Lesson2.reverseArray(a);
    }
    //http://localhost:8080/lesson1/reverseArray/{x}
    @GetMapping("lesson2/evenNumbers/{x}")
    public static int[] evenNumbers(@PathVariable("x") int n){
        return Lesson2.evenNumbers(n);
    }
    @GetMapping("lesson2/min/{x}")
    public static int min(@PathVariable("x")int[] x) {
        return Lesson2.min(x);
    }
    @GetMapping("lesson2/max/{x}")
    public static int max(@PathVariable("x") int[] x){
        return Lesson2.max(x);
    }
    @GetMapping("lesson2/sum/{x}")
    public static int sum(@PathVariable("x")int[] x){
        return Lesson2.sum(x);
    }
    @GetMapping("lesson2/fibonacci/{x}")
    public static int fibonacci(@PathVariable("x")int n){
        return Lesson2.fibonacci(n);
    }
    @GetMapping("lesson2/sequence3n/{x}/{y}")
    public static int sequence3n(@PathVariable("x") int x,@PathVariable("y") int y){
        return Lesson2.sequence3n(x, y);
    }
    @GetMapping("lesson2b/sampleArray/{x}")
    public static int[] sampleArray(@PathVariable("x") int n){
        return Lesson2b.sampleArray(n);
    }
    @GetMapping("lesson2b/generateArray/{x}")
    public static int[] generateArray(@PathVariable("x") int n){
        return Lesson2b.generateArray(n);
    }
    @GetMapping("lesson2c/yl3/{x}")
    public static int[] yl3(@PathVariable("x") int n){
        return Lesson2c.yl3(n);
    }
    @GetMapping("lesson3/factorial/{x}")
    public static int factorial(@PathVariable("x") int x){
        return Lesson3.factorial(x);
    }
    @GetMapping("lesson3/reverseString/{x}")
    public static String reverseString(@PathVariable("x") String a){
        return Lesson3.reverseString(a);
    }
    @GetMapping("lesson3/isPrime/{x}")
    public static boolean isPrime(@PathVariable("x") int x){
        return Lesson3.isPrime(x);
    }
    @GetMapping("lesson3/sort/{x}")
    public static int[] sort(@PathVariable("x") int[] a){
        return Lesson3.sort(a);
    }
    @GetMapping("lesson3/evenFibonacci/{x}")
    public static int evenFibonacci(@PathVariable("x") int x){
        return Lesson3.evenFibonacci(x);
    }
    @GetMapping("lesson3/morseCode/{x}")
    public static String morseCode(@PathVariable("x") String text){
        return Lesson3.morseCode(text);
    }
    //http://localhost:8080/lesson3Hard?n=50
    @GetMapping("lesson3Hard")
    public static String Play(@RequestParam("n") int n){
        return Lesson3Hard.Play(n);
    }
}
