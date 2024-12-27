package org.davidmoten.text.utils;

import static org.junit.Assert.*;

import org.junit.Test;
import org.davidmoten.text.utils.WordWrap;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedWordWrapReadWriterTest {

    @Test
    public void wordWrapReadWriterTest() throws IOException {
        StringWriter out = new StringWriter();
        WordWrap.wordWrap(new StringReader("Testing wordWrap(Reader, Writer...) method"), out, "\n", 80, null, null, false, false);
        assertEquals("Testing wordWrap(Reader, Writer...) method", out.toString());
    }

}