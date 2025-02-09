package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashSet;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;

public class GeneratedWordWrapWithBreakWordsTest {

    @Test
    public void wordWrapWithBreakWordsTest() throws IOException {
        StringReader in = new StringReader("HelloWorld");
        StringWriter out = new StringWriter();
        WordWrap.wordWrap(in, out, "\n", 5, String::length, new HashSet<>(), false, true);
        assertEquals("Hello\nWorld", out.toString());
    }

}