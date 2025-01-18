package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedWordWrapFirstScenarioTest {

    @Test
    public void wordWrapFirstScenarioTest() throws IOException {
        Reader in = new StringReader("Test Data");
        Writer out = new StringWriter();
        Set<Character> extraWordChars = new HashSet<>();
        extraWordChars.add('-');
        WordWrap.wordWrap(in, out, "\n", 10, input -> input.length(), extraWordChars, true, true);
        assertEquals("Test Data\n", out.toString());
    }

}