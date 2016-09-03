package org.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class KeyTest {

    private char root = 'a';
    private String mode = "minor";
    private Key k = new Key(root,mode);
    @Test
    public void testToString() throws Exception {
        assertEquals(k.toString(),"a minor");
    }
}