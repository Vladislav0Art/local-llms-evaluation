package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.util.HashSet;
import java.nio.charset.StandardCharsets;

public class GeneratedIsWhitespaceTest {

    @Test
    public void isWhitespaceTest() {
        assertTrue(WordWrap.isWhitespace("     "));
        assertFalse(WordWrap.isWhitespace("This is a unit test"));
    }

}