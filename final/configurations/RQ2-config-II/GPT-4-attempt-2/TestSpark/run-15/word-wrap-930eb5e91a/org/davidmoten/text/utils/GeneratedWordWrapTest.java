package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class GeneratedWordWrapTest {

    @Test
    public void wordWrapTest() throws IOException {
        StringReader in = new StringReader("Test word wrap");
        StringWriter out = new StringWriter();
        WordWrap.wordWrap(in, out, "\n", 5, CharSequence::length, new HashSet<>(), false, false);
        assertEquals("Test\nword\nwrap", out.toString().trim());
    }

}