package org.model;

import java.util.ArrayList;
import java.util.List;

public class Measure {
    private Key key;
    private Time time;
    private int divisions; //divisions per quarter note
    private List<Symbol> symbols = new ArrayList<Symbol>();
    private List<Integer> integers = new ArrayList<Integer>();

    // constructor, getters, setters
    public Measure(Key key, Time time, int divisions) {
        this.key = key;
        this.time = time;
        this.divisions = divisions;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getDivisions() {
        return divisions;
    }

    public void setDivisions(int divisions) {
        this.divisions = divisions;
    }

    // add notes and rests
    public void addSymbol(Symbol symbol) {
        symbols.add(symbol);
    }

    // symbol doesn't have a toString so it just calls Object.toString.
    // how do you do it without if instanceOf?
    @Override
    public String toString() {
        String str = "";
        for(Symbol sym : symbols) {
            if (sym instanceof Note) {
                str += ((Note)sym).toString() + " ";
            }
            else if (sym instanceof Rest) {
                str += ((Rest)sym).toString() + " ";
            }
        }
        return str;
    }

}