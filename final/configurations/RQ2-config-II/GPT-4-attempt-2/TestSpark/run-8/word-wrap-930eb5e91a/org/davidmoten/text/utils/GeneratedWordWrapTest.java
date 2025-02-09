package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashSet;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;

public class GeneratedWordWrapTest {

    @Test
    public void wordWrapTest() throws IOException {
        StringReader in = new StringReader("Hello");
        StringWriter out = new StringWriter();
        WordWrap.wordWrap(in, out, "\n", 80, String::length, new HashSet<>(), false, false);
        assertEquals("Hello", out.toString());
    }

}