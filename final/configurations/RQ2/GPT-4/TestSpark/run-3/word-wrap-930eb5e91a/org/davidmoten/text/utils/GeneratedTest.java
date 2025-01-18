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

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        Reader reader = new StringReader("Test");
        assertNotNull(WordWrap.from(reader));
    }

    @Test
    public void fromClasspathUtf8Test() {
        assertNotNull(WordWrap.fromClasspathUtf8("TestResource"));
    }

    @Test
    public void fromClasspathTest() {
        assertNotNull(WordWrap.fromClasspath("TestResource", StandardCharsets.UTF_8));
    }

    @Test
    public void fromCharSequenceTest() {
        assertNotNull(WordWrap.from("TestString"));
    }

    @Test
    public void fromInputStreamUtf8NullTest() {
        WordWrap.fromUtf8(null);
    }

    @Test
    public void fromInputStreamCharsetTest() {
        assertNotNull(WordWrap.from(System.in, StandardCharsets.UTF_8));
    }

    @Test
    public void fromFileCharsetNullTest() {
        File file = null;
        WordWrap.from(file, StandardCharsets.UTF_8);
    }

    @Test
    public void isWhitespaceTest() {
        assertTrue(WordWrap.isWhitespace(" "));
        assertFalse(WordWrap.isWhitespace("Test"));
    }

    @Test
    public void rightTrimTest() {
        assertEquals("Test ", WordWrap.rightTrim("Test     "));
        assertEquals("  Test", WordWrap.rightTrim("  Test"));
    }

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