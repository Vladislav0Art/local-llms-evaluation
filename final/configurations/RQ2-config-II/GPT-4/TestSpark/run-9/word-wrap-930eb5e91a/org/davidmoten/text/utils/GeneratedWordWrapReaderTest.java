package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

import static org.junit.Assert.*;

public class GeneratedWordWrapReaderTest {

    @Test
    public void wordWrapReaderTest() {
        Set<Character> extras = new HashSet<>();
        extras.add('-');
        try {
            StringReader in = new StringReader("This is a fairly long piece of text that needs wrapping");
            StringWriter out = new StringWriter();
            WordWrap.wordWrap(in, out, "\n", 10,
                    (cs -> cs.length()), extras, true, true);
            assertEquals("This is a \nfairly long \npiece of \ntext that \nneeds \nwrapping", out.toString());
        } catch (IOException e) {
            fail();
        }
    }

}