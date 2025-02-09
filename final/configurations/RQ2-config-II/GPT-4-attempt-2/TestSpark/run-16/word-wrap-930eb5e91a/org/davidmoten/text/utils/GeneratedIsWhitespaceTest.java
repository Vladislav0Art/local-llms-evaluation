package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedIsWhitespaceTest {

    @Test
    public void isWhitespaceTest() {
        boolean result = WordWrap.isWhitespace("    ");
        assertTrue(result);
    }

}