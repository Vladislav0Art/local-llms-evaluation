package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.util.HashSet;
import java.nio.charset.StandardCharsets;

public class GeneratedWordWrapTest {

    @Test
    public void wordWrapTest() throws IOException {
        StringReader reader = new StringReader("This is a very long line of text that should be wrapped at some point.");
        StringWriter writer = new StringWriter();
        WordWrap.wordWrap(
                reader,
                writer,
                "\n",
                50,
                s -> s.length(),
                new HashSet<Character>(),
                false,
                true
        );
        assertNotNull(writer.toString());
    }

}