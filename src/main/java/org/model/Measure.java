package org.model;

import java.util.ArrayList;
import java.util.List;

public class Measure {
    private Key key;
    private Time time;
    private int divisions; //divisions per quarter note
    private List<Symbol> symbols = new ArrayList<Symbol>();

    public Measure(Key key, Time time, int divisions) {
        this.key = key;
        this.time = time;
        this.divisions = divisions;
    }

//    public void addSymbol(Symbol symbol) {
//        symbols.add(symbol);
//    }

    public void printHello() {
        System.out.println("hello world");
    }

    @Override
    public String toString() {
        return symbols.toString();
    }

}