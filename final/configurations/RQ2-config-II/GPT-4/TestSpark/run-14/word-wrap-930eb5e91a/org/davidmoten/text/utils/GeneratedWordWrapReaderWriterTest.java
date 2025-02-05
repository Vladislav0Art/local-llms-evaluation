package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.*;

public class GeneratedWordWrapReaderWriterTest {

    @Test
    public void wordWrapReaderWriterTest() throws IOException {
        Reader in = new StringReader("Testing wordWrap method.");
        Writer out = new StringWriter();
        WordWrap.wordWrap(in, out, "\n", 10,
                CharSequence::length, new HashSet<>(), false, false);
        assertEquals("Testing wordWrap method.", out.toString().trim());
    }

}