package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

public class GeneratedTestIsWhitespace {

    @Test
    public void testIsWhitespace() throws Exception {
        Reader reader = new ByteArrayInputStream("\n".getBytes(StandardCharsets.UTF_8));
        WordWrap wordWrap = WordWrap.fromClasspath(reader);
        assertTrue(wordWrap.isWhitespace(""));
        assertFalse(wordWrap.isWhitespace("test"));
    }
}

class Preconditions {

    public static <T> void checkState(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }

    public static <T> T leftTrim(T value) {
        return value;
    }
}

public class WordWrap {

    public static Reader fromClasspath(Reader reader) throws Exception {
        // implementation
        return null;
    }

    public String rightTrim(String s) {
        // implementation
        return null;
    }

    public boolean isWhitespace(CharSequence s) {
        // implementation
        return false;
    }

}