package org.model;

public class Note extends Symbol {
    private char letter; //or pitch class, name, something else...
    private int alter;
    private int octave;
    private Lyric lyric;

    // how to represent sequence and chords?
    // musicxml assumes notes are sequential and duration moves forward counter
    // unless they are tagged as chord in which case they are same time as previous
    // Another option is to have a starting location for each note


    public Note(char letter) {
        this.letter = letter;
    }

    //@Override
    public String valueOf() {
        return letter + ""; //must be a smarter way to do this
    }
}
