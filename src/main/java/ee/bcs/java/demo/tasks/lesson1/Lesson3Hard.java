package ee.bcs.java.demo.tasks.lesson1;

import java.util.Random;
import java.util.Scanner;

public class Lesson3Hard {
    static Random random = new Random();
    static int i = random.nextInt(100);
    static int count = 0 ;


    public static String Play(int n) {

        if (n == i) {
            i = random.nextInt(100);
            int a = count;
            count = 0;
            return "Sa arvasid õigesti! Katsetasid "+ a + " kord kokku.";

        }
        else if (n > i) {
            count++;
            return "Sisetatud number oli liiga suur. Palun vähendada.";
        }
        else if (n < i) {
            count++;
            return "Sisetatud number oli liiga väike. Palun suurendada.";
        }
        else {
            return "Sa ei siseta numbrit. Palun uuesti sisetada.";
        }
    }


    // TODO kirjuta mäng mis leiab suvalise numbri 0-99, mille kasutaja peab ära arvama
    // iga kord pärast kasutaja sisestatud täis arvu peab programm ütlema kas number oli suurem või väiksem
    // ja kasutaja peab saama uuesti arvata
    // numbri ära aramise korral peab programm välja trükkima mitu katset läks numbri ära arvamiseks
    public static void main(String[] args) {

    }
//        int count = 0;
//        Random random = new Random();
//        int i = random.nextInt(100);
//        //System.out.println(i);
//        System.out.println("Numbrimäng");
//        System.out.println("Arva number ära (0-100): ");
//        while(true) {
//            count++;
//            Scanner scanner = new Scanner(System.in);
//            int a = scanner.nextInt();
//            if (a == i){
//                System.out.println("Palju õnne! Sa arvasid õigesti numbri.");
//                System.out.println("Sa katsetasid "+count+" korda.");
//                System.out.println("Kas soovid uue jätkata? (JAH/EI)");
//                Scanner scanner1 = new Scanner(System.in);
//                String ask = scanner1.next();
//                String askY = ask.toUpperCase();
//                //System.out.println(askY);
//                if ( askY.equals("JAH")) {
//                    System.out.println("Uus mäng algab.");
//                    count = 0;
//                    i = random.nextInt(100);
//                    //System.out.println(i);
//                    continue;
//                }
//                else
//                    System.out.println("Mäng lõpetatud");
//                    break;
//            }
//            else if ( a > i){
//                System.out.println("Sisetatud number oli liiga suur. Palun vähendada. ");
//            }
//            else if ( a < i){
//                System.out.println("Sisetatud number oli liiga väike. Palun suurendada. ");
//            }
//            else {
//                System.out.println("Sa ei siseta numbrit. Palun uuesti sisetada.");
//            }
//        }
//    }

}
