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

public class GeneratedWordWrapWriterTest {

    @Test
    public void wordWrapWriterTest() throws IOException {
        StringReader in = new StringReader("Test data");
        StringWriter writer = new StringWriter();
        Function<CharSequence, Number> stringWidth = s -> s.length();
        WordWrap.wordWrap(in, writer, "n", 10, stringWidth, Collections.emptySet(), false, false);
        assertEquals("Test data", writer.toString());
    }

}