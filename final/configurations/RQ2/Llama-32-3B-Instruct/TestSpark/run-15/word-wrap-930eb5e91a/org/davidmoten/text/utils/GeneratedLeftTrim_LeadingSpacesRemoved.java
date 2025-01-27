package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.charset.Charset;

public class GeneratedLeftTrim_LeadingSpacesRemoved {

    @Test
    public void leftTrim_LeadingSpacesRemoved() {
        String expected = "Hello";
        WordWrap.leftTrim(new StringBuilder2(expected));
    }
}

class StringReader extends java.io.Reader {
    private final String string;

    public StringReader(String string) {
        this.string = string;
    }

    @Override
    public int read() throws IOException {
        return 0;
    }

    @Override
    public void close() throws IOException {

    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return 0;
    }
}

}