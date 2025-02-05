package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        Reader reader = new StringReader("testing");
        assertNotNull(WordWrap.from(reader));
    }

    @Test
    public void fromClasspathUtf8Test() {
        assertNotNull(WordWrap.fromClasspathUtf8("resource"));
    }

    @Test
    public void fromClasspathTest() {
        assertNotNull(WordWrap.fromClasspath("resource", StandardCharsets.UTF_8));
    }

    @Test
    public void fromCharSequenceTest() {
        CharSequence text = "testing";
        assertNotNull(WordWrap.from(text));
    }

    @Test
    public void fromUtf8InputStreamTest() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[10]);
        assertNotNull(WordWrap.fromUtf8(in));
    }

    @Test
    public void fromInputStreamCharsetTest() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[10]);
        assertNotNull(WordWrap.from(in, StandardCharsets.UTF_8));
    }

    @Test
    public void fromFileCharsetTest() {
        File file = new File("test-file.txt");
        assertNotNull(WordWrap.from(file, StandardCharsets.UTF_8));
    }

    @Test
    public void rightTrimTest() {
        CharSequence sequence = "   trim   ";
        CharSequence rightTrimmed = WordWrap.rightTrim(sequence);
        assertEquals("   trim", rightTrimmed);
    }

    @Test
    public void isWhitespaceTest() {
        CharSequence sequence = "    ";
        assertTrue(WordWrap.isWhitespace(sequence));
    }

    @Test
    public void isWhitespaceFailsTest() {
        CharSequence sequence = "  no  ";
        assertFalse(WordWrap.isWhitespace(sequence));
    }

}