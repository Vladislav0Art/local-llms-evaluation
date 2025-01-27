package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedIsWhitespaceStringContainsWhitespaceChar {

    @Test
    public void isWhitespaceStringContainsWhitespaceChar() {
        assertTrue(WordWrap.isWhitespace("   "));
    }

}