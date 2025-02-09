package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

public class GeneratedWordWrapTest {

    @Test
    public void wordWrapTest() throws IOException {
        StringWriter writer = new StringWriter();
        WordWrap.wordWrap(new StringReader("Test"), writer, "\n", 4,
                str -> str.length(), new HashSet<>(), false, false);
        assertEquals("Test", writer.toString());
    }

}