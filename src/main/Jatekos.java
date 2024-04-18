package main;

import java.util.Random;


public class Jatekos {
    
    Random rnd = new Random();
    int tipp;
    
    void tippel(){
        tipp = rnd.nextInt(10);
        System.out.println("tippelésem: " + tipp);
    }
}
