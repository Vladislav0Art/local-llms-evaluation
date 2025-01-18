package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedWordWrapSecondScenarioTest {

    @Test
    public void wordWrapSecondScenarioTest() throws IOException {
        Reader in = new StringReader("TestDataExample");
        Writer out = new StringWriter();
        HashSet<Character> extraWordChars = new HashSet<>();

        WordWrap.wordWrap(in, out, "\n", 5, CharSequence::length,
                extraWordChars, true, false);

        assertEquals("TestD\nataEx\nample\n", out.toString());
    }

}