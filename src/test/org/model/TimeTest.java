package org.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTest {

    private int beats = 3;
    private int beatType = 4;
    private Time t = new Time(beats,beatType);

    @Test
    public void testToString() throws Exception {
        assertEquals(t.toString(),"3/4");
    }
}