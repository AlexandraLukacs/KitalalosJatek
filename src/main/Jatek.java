package main;

import java.util.Random;


public class Jatek {
    
    
    /* Konstruktor
        - ua neve, mint az osztálynak
        - nincs típusa, void sem
        - akkor is van, ha nem írtuk meg, ez az alapértelmezett konstruktor
    */
    public Jatek() {
        /* konstruktor hívás a main-hez */
        start();
    }
    
    void start(){
        System.out.println("Gondoltam egy számra, 0 és 9 között...");
        
        Random rnd = new Random();
        int szam = rnd.nextInt(10);
        System.out.println("a kitalálandó szám: " + szam);
    }
    
}
