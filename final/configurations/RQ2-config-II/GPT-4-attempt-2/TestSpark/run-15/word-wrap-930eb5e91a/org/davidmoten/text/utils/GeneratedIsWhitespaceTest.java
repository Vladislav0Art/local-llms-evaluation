package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class GeneratedIsWhitespaceTest {

    @Test
    public void isWhitespaceTest() {
        assertEquals(true, WordWrap.isWhitespace(" "));
        assertEquals(false, WordWrap.isWhitespace("A"));
    }

}