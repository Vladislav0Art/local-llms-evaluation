package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedWordWrapTest {

    @Test
    public void wordWrapTest() throws IOException {
        StringReader in = new StringReader("hel");
        StringWriter out = new StringWriter();
        Set<Character> extraWordChars = new HashSet<>();
        WordWrap.wordWrap(in, out, "\n", 2,
                x -> x.length(),
                extraWordChars, false, false);
        assertEquals("h\ne\nl\n", out.toString());
    }

}