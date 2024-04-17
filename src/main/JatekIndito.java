
package main;


public class JatekIndito {

    
    
    public static void main(String[] args) {
        /* referencia nélkül hívjuk az objektum metódusát */
//      new Jatek().start();

        /* referenciát adunk az objektumra, és azon keresztül hívjuk */
//      Jatek referencia = new Jatek();
//      referencia.start();

        /* csak a konstruktort hívjuk, referencia nélkül */
        new Jatek();
        
        new Jatekos().tippel();
    }
    
}
