package org.davidmoten.text.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

import org.junit.Test;

public class GeneratedFromInputStreamCharsetTest {

    @Test
    public void fromInputStreamCharsetTest() {
        InputStream stream = new ByteArrayInputStream("hello world".getBytes(StandardCharsets.UTF_8));
        WordWrap.Builder builder = WordWrap.from(stream, StandardCharsets.UTF_8);
        assertEquals("Test", builder.toString());
    }

}