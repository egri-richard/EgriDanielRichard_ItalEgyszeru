package com.company;

/**
 * A Aszu osztály a Bor osztály leszármazottja és egy specifikus bortipus tárolására
 * lett létrehozva, ezért van puttony attributuma ami csak az Aszúra jellemző.
 */
public class Aszu extends Bor {

    private static final String fajta = "aszu";
    private int puttony;

    public Aszu(int evjarat, int puttony) {
        super(fajta, evjarat);
        this.puttony = puttony;
    }

    public int getPuttony() {
        return puttony;
    }

    public void setPuttony(int puttony) {
        this.puttony = puttony;
    }

    @Override
    public String toString() {
        return super.toString() + ", puttony: " +puttony;
    }
}
