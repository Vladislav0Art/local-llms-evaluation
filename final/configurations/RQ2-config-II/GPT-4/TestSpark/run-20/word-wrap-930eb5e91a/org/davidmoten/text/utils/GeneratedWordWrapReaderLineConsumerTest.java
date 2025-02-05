package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedWordWrapReaderLineConsumerTest {

    @Test
    public void wordWrapReaderLineConsumerTest() throws IOException {
        final Reader input = new StringReader("This is another long text to be wrapped.");
        final StringWriter output = new StringWriter();
        WordWrap.wordWrap(input, output::write, 10, CharSequence::length, new HashSet<>(), false, false);
        assertTrue(output.toString().split("\n").length > 1);
    }

}