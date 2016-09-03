package org.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class KeyTest {

    private char root = 'a';
    private String mode = "minor";
    private Key key = new Key(root,mode);

    @Test
    public void testToString() throws Exception {
        assertEquals(key.toString(), "a minor");
    }
}