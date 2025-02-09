package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

public class GeneratedWordWrapIOExceptionTest {

    @Test
    public void wordWrapIOExceptionTest() throws IOException {
        WordWrap.wordWrap(new BadReader(), new StringWriter(), "\n", 4,
                str -> str.length(), new HashSet<>(), false, false);
    }
}

class BadReader extends StringReader {
    BadReader() {
        super("");
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        throw new IOException();
    }

}