package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import static org.junit.Assert.*;

public class GeneratedWordWrapReaderWriterTest {

    @Test
    public void wordWrapReaderWriterTest() throws IOException {
        Reader reader = new StringReader("wordWrapTest");
        StringWriter writer = new StringWriter();
        HashSet<Character> set = new HashSet<>();
        set.add('-');
        WordWrap.wordWrap(reader, writer, "\n", 80, CharSequence::length, set, true, false);
        assertFalse(writer.toString().isEmpty());
    }

}