package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedWordWrapToWriterTest {

    @Test
    public void wordWrapToWriterTest() throws IOException {
        StringWriter out = new StringWriter();
        WordWrap.wordWrap(new StringReader("some text"), out, "\n", 80, String::length, null, true, false);
        assertEquals("some text", out.toString());
    }

}