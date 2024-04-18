package main;

import java.util.Random;

public class Jatek {

    Random rnd = new Random();
    
    /* Konstruktor
        - ua neve, mint az osztálynak
        - nincs típusa, void sem
        - akkor is van, ha nem írtuk meg, ez az alapértelmezett konstruktor
     */
    public Jatek() {
        /* konstruktor hívás a main-hez */
        start();
    }
    
    void start() {
        System.out.println("Gondoltam egy számra, 0 és 9 között...");

        
        int szam = rnd.nextInt(10);
        System.out.println("a kitalálandó szám: " + szam);

        /* 3 játékos tippel */
        Jatekos jatekos1 = new Jatekos();
        jatekos1.tippel();
        Jatekos jatekos2 = new Jatekos();
        jatekos2.tippel();
        Jatekos jatekos3 = new Jatekos();
        jatekos3.tippel();

//        System.out.println("1. játékos tippje: " + jatekos1.tipp);
//        System.out.println("2. játékos tippje: " + jatekos2.tipp);
//        System.out.println("3. játékos tippje: " + jatekos3.tipp);
        boolean tipp1jo, tipp2jo, tipp3jo;
        tipp1jo = szam == jatekos1.tipp;
        tipp2jo = szam == jatekos2.tipp;
        tipp3jo = szam == jatekos2.tipp;
        boolean vanNyertes = tipp1jo || tipp2jo || tipp3jo;

        while (!vanNyertes) {
            System.out.println("a játékosok újra próbálkoznak!");
            System.out.println("a kitalálandó szám: " + szam);

            jatekos1.tippel();
            jatekos2.tippel();
            jatekos3.tippel();

            System.out.println("1. játékos tippje: " + jatekos1.tipp);
            System.out.println("2. játékos tippje: " + jatekos2.tipp);
            System.out.println("3. játékos tippje: " + jatekos3.tipp);

            tipp1jo = szam == jatekos1.tipp;
            tipp2jo = szam == jatekos2.tipp;
            tipp3jo = szam == jatekos3.tipp;
            vanNyertes = tipp1jo || tipp2jo || tipp3jo;

        }
        System.out.println("Van nyertes!");
        System.out.println("1. játékos tippje: " + tipp1jo);
        System.out.println("2. játékos tippje: " + tipp2jo);
        System.out.println("3. játékos tippje: " + tipp3jo);
        System.out.println("Játék Vége");

    }

}
