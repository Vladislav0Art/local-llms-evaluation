package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedWordWrapReaderWriterTest {

    @Test
    public void wordWrapReaderWriterTest() throws IOException {
        final Reader input = new StringReader("This is a long text to be wrapped.");
        final StringWriter output = new StringWriter();
        WordWrap.wordWrap(input, output, "\n", 10, CharSequence::length, new HashSet<>(), false, false);
        assertTrue(output.toString().split("\n").length > 1);
    }

}