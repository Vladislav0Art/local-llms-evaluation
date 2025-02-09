package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.function.Function;
import java.io.BufferedReader;
import java.io.IOException;

public class GeneratedWordWrapLineConsumerTest {

    @Test
    public void wordWrapLineConsumerTest() throws IOException {
        StringReader in = new StringReader("Test data");
        StringWriter writer = new StringWriter();
        LineConsumer consumer = new LineConsumer(writer);
        Function<CharSequence, Number> stringWidth = s -> s.length();
        WordWrap.wordWrap(in, consumer, 10, stringWidth, Collections.emptySet(), false, false);
        assertEquals("Test data", writer.toString());
    }

}