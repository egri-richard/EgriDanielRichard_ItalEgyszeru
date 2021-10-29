package com.company;

/**
 * A bor osztály a borok fajtáját és évjáratát tartalmazza és
 * ezek az attributumok kiiratására is képes.
 */
public class Bor {

    private String fajta;
    private int evjarat;

    public Bor(String fajta, int evjarat) {
        this.fajta = fajta;
        this.evjarat = evjarat;
    }

    public String getFajta() {
        return fajta;
    }

    public int getEvjarat() {
        return evjarat;
    }

    public void setFajta(String fajta) {
        this.fajta = fajta;
    }

    public void setEvjarat(int evjarat) {
        this.evjarat = evjarat;
    }

    @Override
    public String toString() {
        return "BOR: fajta: " +fajta+ ", évjárat: " +evjarat;
    }
}
