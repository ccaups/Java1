package ee.bcs.java.demo.tasks.lesson1;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Lesson3Hard {

    // TODO kirjuta mäng mis leiab suvalise numbri 0-99, mille kasutaja peab ära arvama
    // iga kord pärast kasutaja sisestatud täis arvu peab programm ütlema kas number oli suurem või väiksem
    // ja kasutaja peab saama uuesti arvata
    // numbri ära aramise korral peab programm välja trükkima mitu katset läks numbri ära arvamiseks
    public static void main(String[] args) {
        int count = 0;
        Random random = new Random();
        int i = random.nextInt(100);
        //System.out.println(i);
        System.out.println("Numbrimäng");
        System.out.println("Arva number ära (0-100): ");
        while(true) {
            count++;
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            if (a == i){
                System.out.println("Palju õnne! Sa arvasid õigesti numbri.");
                System.out.println("Sa katsetasid "+count+" korda.");
                System.out.println("Kas soovid uue jätkata? (JAH/EI)");
                Scanner scanner1 = new Scanner(System.in);
                String ask = scanner1.next();
                String askY = ask.toUpperCase();
                //System.out.println(askY);
                if ( askY.equals("JAH")) {
                    System.out.println("Uus mäng algab.");
                    count = 0;
                    i = random.nextInt(100);
                    //System.out.println(i);
                    continue;
                }
                else
                    System.out.println("Mäng lõpetatud");
                    break;
            }
            else if ( a > i){
                System.out.println("Sisetatud number oli liiga suur. Palun vähendada. ");
            }
            else if ( a < i){
                System.out.println("Sisetatud number oli liiga väike. Palun suurendada. ");
            }
            else {
                System.out.println("Sa ei siseta numbrit. Palun uuesti sisetada.");
            }
        }
    }
}
