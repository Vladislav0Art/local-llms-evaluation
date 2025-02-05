package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

import static org.junit.Assert.*;

public class GeneratedWordWrapTest {

    @Test
    public void wordWrapTest() throws IOException {
        Set<Character> extraWordChars = new HashSet<>();
        extraWordChars.add('.');
        Function<CharSequence, Number> stringWidth = str -> ((CharSequence) str).length();
        try (StringWriter out = new StringWriter()) {
            try (StringReader in = new StringReader("Hello world.")) {
                WordWrap.wordWrap(in, out, "\n", 5, stringWidth, extraWordChars,
                        false, false);
                assertEquals("Hello\nworld.", out.toString());
            }
        }
    }

}