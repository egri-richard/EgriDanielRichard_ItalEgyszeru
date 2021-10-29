package com.company;

/**
 * Futtatható osztály, amire a többi osztályban létrehozott funkciók tesztelése miatt van szükség.
 *
 * @author egrid
 */
public class TesztBor {

    public static void main(String[] args) {
        Bor b1 = new Bor("Voros", 1999);
        Bor b2 = new Bor("Feher", 2010);
        Bor b3 = new Aszu(1995, 4);

        kiirBor(b1);
        kiirBor(b2);
        kiirBor(b3);
    }

    public static void kiirBor(Bor bor) {
        System.out.println(bor);
    }
}
