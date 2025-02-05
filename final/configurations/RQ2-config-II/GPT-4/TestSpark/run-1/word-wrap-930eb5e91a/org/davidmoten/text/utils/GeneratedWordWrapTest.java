package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertEquals;

public class GeneratedWordWrapTest {

    @Test
    public void wordWrapTest() throws IOException {
        StringReader reader = new StringReader("Hello, world!");
        StringWriter writer = new StringWriter();
        WordWrap.wordWrap(reader, writer, "\n", 80, s -> s.length(), new HashSet<>(), false, false);
        assertEquals("Hello, world!", writer.toString().trim());
    }

}