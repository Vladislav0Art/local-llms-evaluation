package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashSet;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void fromReaderTest() throws FileNotFoundException {
        Reader reader = new InputStreamReader(new FileInputStream("src/test/resources/wordwrap.txt"));
        assertNotNull(WordWrap.from(reader));
    }

    @Test
    public void fromReaderNullTest() {
        WordWrap.from((Reader) null);
    }

    @Test
    public void fromClasspathUtf8Test() {
        assertNotNull(WordWrap.fromClasspathUtf8("wordwrap.txt"));
    }

    @Test
    public void fromClasspathCharsetTest() {
        assertNotNull(WordWrap.fromClasspath("wordwrap.txt", Charset.defaultCharset()));
    }

    @Test
    public void fromCharSequenceTest() {
        assertNotNull(WordWrap.from("some text"));
    }

    @Test
    public void fromUtf8StreamTest() throws FileNotFoundException {
        InputStream in = new FileInputStream("src/test/resources/wordwrap.txt");
        assertNotNull(WordWrap.fromUtf8(in));
    }

    @Test
    public void fromStreamCharsetTest() throws FileNotFoundException {
        InputStream in = new FileInputStream("src/test/resources/wordwrap.txt");
        assertNotNull(WordWrap.from(in, Charset.defaultCharset()));
    }

    @Test
    public void fromFileCharsetTest() {
        assertNotNull(WordWrap.from(new File("src/test/resources/wordwrap.txt"), Charset.defaultCharset()));
    }

    @Test
    public void rightTrimTest() {
        assertEquals("Hello", WordWrap.rightTrim("Hello  ").toString());
    }

    @Test
    public void isWhitespaceTest() {
        assertTrue(WordWrap.isWhitespace("  "));
        assertFalse(WordWrap.isWhitespace("Hello"));
    }

}