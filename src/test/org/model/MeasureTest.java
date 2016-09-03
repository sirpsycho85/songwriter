package org.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class MeasureTest {

    private Key key = new Key('a', "minor");
    private Time time = new Time(3,4);
    private int divisions = 24;
    private Measure measure = new Measure(key,time,divisions);

    private Note note = new Note('a');
    private Note note2 = new Note('c');
    private Rest rest = new Rest();

    @Test
    public void testToString() throws Exception {
        this.measure.addSymbol(note);
        this.measure.addSymbol(note2);
        this.measure.addSymbol(rest);
        System.out.println(measure.toString());
    }
}