package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.function.Function;

import static org.junit.Assert.assertEquals;

public class GeneratedWordWrapReaderWriterTest {

    @Test
    public void wordWrapReaderWriterTest() throws IOException {
        StringReader stringReader = new StringReader("Test string");
        StringWriter stringWriter = new StringWriter();
        Function<CharSequence, Number> stringWidth = CharSequence::length;
        Set<Character> extraWordChars = new HashSet<>();

        WordWrap.wordWrap(stringReader, stringWriter, "\n", 70, stringWidth, extraWordChars, false, false);

        assertEquals("Test string", stringWriter.toString());
    }

}