package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashSet;

import static org.junit.Assert.*;

public class GeneratedWordWrapTest {

    @Test
    public void wordWrapTest() {
        StringReader in = new StringReader("Hello World!");
        StringWriter out = new StringWriter();
        WordWrap.wordWrap(
                in,
                out,
                "\n",
                8,
                (s) -> s.length(),
                new HashSet<>(),
                true,
                true
        );
        assertEquals("Hello\nWorld!", out.toString().trim());
    }

}