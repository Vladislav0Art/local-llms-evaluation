package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.function.Function;

import static org.junit.Assert.*;

public class GeneratedWordWrapReaderLineConsumerTest {

    @Test
    public void wordWrapReaderLineConsumerTest() throws IOException {
        Reader reader = new StringReader("wordWrapTest");
        StringWriter writer = new StringWriter();
        WordWrap.LineConsumer lineConsumer = new WordWrap.LineConsumer(writer);
        HashSet<Character> set = new HashSet<>();
        set.add('-');
        WordWrap.wordWrap(reader, lineConsumer, 80, CharSequence::length, set, true, false);
        assertFalse(writer.toString().isEmpty());
    }

}