package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedWordWrapTest {

    @Test
    public void wordWrapTest() throws IOException {
        StringReader in = new StringReader("Hello World");
        StringWriter out = new StringWriter();
        WordWrap.wordWrap(in, out, "\n", 5, s -> s.length(), new HashSet<>(), false, false);
        assertEquals("Hello\nWorld", out.toString());
    }

}