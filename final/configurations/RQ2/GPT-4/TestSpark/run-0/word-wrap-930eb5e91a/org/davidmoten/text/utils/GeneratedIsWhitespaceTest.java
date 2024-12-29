package org.davidmoten.text.utils;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class GeneratedIsWhitespaceTest {

    @Test
    public void isWhitespaceTest() {
        CharSequence test = "   ";
        boolean result = WordWrap.isWhitespace(test);
        assertEquals(true, result);
    }

}