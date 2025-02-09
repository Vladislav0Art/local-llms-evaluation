package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedWordWrapReaderWriterNewlineMaxWidthTest {

    @Test
    public void wordWrapReaderWriterNewlineMaxWidthTest() throws IOException {
        StringWriter writer = new StringWriter();
        StringReader reader = new StringReader("this is a test");
        Set<Character> extraWordChars = new HashSet<>();
        extraWordChars.add('_');
        extraWordChars.add('-');

        WordWrap.wordWrap(reader, writer, "\n", 10, String::length, extraWordChars, false, false);

        assertEquals("this is a \ntest\n", writer.toString());
    }

}