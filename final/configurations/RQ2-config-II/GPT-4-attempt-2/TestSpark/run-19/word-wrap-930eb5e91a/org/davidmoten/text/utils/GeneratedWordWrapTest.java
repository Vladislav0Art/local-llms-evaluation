package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedWordWrapTest {

    @Test
    public void wordWrapTest() throws IOException {
        StringReader stringReader = new StringReader("test data");
        StringWriter stringWriter = new StringWriter();
        Set<Character> extraWordChars = new HashSet<>();
        extraWordChars.add(',');
        WordWrap.wordWrap(stringReader, stringWriter, "\n", 80, CharSequence::length, extraWordChars, true, false);
    }

}