package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void isWhitespaceReturnsCorrectResult() {
        assertTrue(WordWrap.isWhitespace("   "));
        assertTrue(WordWrap.isWhitespace("\t"));
        assertFalse(WordWrap.isWhitespace("HelloWorld"));
    }

}