package org.davidmoten.text.utils;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class GeneratedWordWrapTrimTest {

    @Test
    public void wordWrapTrimTest() throws Exception {
        String testStr = "This is a long sentence that may need to be wrapped.";
        StringReader reader = new StringReader(testStr);
        StringWriter writer = new StringWriter();
        Set<Character> extraChars = new HashSet<>();
        WordWrap.wordWrap(reader, writer, "\n", 10, CharSequence::length, extraChars, false, false);
        String[] lines = writer.toString().split("\n");
        for (String line : lines) {
            assertEquals(10, line.length());
        }
    }

}