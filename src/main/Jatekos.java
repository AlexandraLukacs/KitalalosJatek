package main;

import java.util.Random;


public class Jatekos {
    void tippel(){
        Random rnd = new Random();
        int tipp = rnd.nextInt(10);
        System.out.println("tippelésem: " + tipp);
    }
}
