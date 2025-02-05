package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.function.Function;

import static org.junit.Assert.assertEquals;

public class GeneratedWordWrapLineConsumerTest {

    @Test
    public void wordWrapLineConsumerTest() throws IOException {
        TestLineConsumer testLineConsumer = new TestLineConsumer();
        StringReader stringReader = new StringReader("Test string");
        Function<CharSequence, Number> stringWidth = CharSequence::length;
        Set<Character> extraWordChars = new HashSet<>();

        WordWrap.wordWrap(stringReader, testLineConsumer, 70, stringWidth, extraWordChars, false, false);

        assertEquals("Test string", testLineConsumer.getOutput());
    }

}