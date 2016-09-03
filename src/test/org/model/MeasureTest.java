package org.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class MeasureTest {

    private Key key = new Key('a', "minor");
    private Time time = new Time(3,4);
    private int divisions = 24;
    private Measure measure = new Measure(key,time,divisions);

    private Note note = new Note('a');


    @Test
    public void testToString() throws Exception {
        System.out.println(measure.toString());
    }
}