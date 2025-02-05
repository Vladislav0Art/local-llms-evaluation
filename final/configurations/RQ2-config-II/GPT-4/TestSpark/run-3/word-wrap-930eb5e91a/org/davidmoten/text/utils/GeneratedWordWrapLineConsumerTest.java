package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class GeneratedWordWrapLineConsumerTest {

    @Test
    public void wordWrapLineConsumerTest() throws IOException {
        StringWriter writer = new StringWriter();
        BufferedReader reader = new BufferedReader(new StringReader("WordWrap.wordWrap test"));
        LineConsumer lineConsumer = new StringWriterLineConsumer(writer);
        Set<Character> extraWordChars = new HashSet<Character>() {{
            add('-');
        }};
        WordWrap.wordWrap(reader, lineConsumer, 10, CharSequence::length, extraWordChars, false, false);
        assertEquals("WordWrap\n.wordWrap\ntest\n", writer.toString());
    }

}