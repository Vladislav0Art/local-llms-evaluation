package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedIsWhitespaceTest {

    @Test
    public void isWhitespaceTest() {
        boolean whitespace = WordWrap.isWhitespace("   ");
        assertTrue(whitespace);
    }

}