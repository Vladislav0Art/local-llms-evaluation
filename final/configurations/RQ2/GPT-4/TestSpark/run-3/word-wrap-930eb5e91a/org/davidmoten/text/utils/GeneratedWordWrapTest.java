package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import static org.junit.Assert.*;

public class GeneratedWordWrapTest {

    @Test
    public void wordWrapTest() throws IOException {
        Reader reader = new StringReader("The rain in Spain stays mainly in the plain");
        StringWriter out = new StringWriter();
        String newline = "\n";
        int maxWidth = 10;
        WordWrap.wordWrap(reader, out, newline, maxWidth, (s) -> s.length(), new HashSet<Character>(), false, false);
        assertTrue(out.toString().contains(newline));
    }

}