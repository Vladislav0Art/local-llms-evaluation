package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        Reader reader = new StringReader("Sample text");
        assertNotNull(WordWrap.from(reader));
    }

    @Test
    public void fromClasspathUtf8Test() {
        assertNotNull(WordWrap.fromClasspathUtf8("utf8resource.txt"));
    }

    @Test
    public void fromClasspathTest() {
        assertNotNull(WordWrap.fromClasspath("resource.txt", Charset.defaultCharset()));
    }

    @Test
    public void fromCharSequenceTest() {
        assertNotNull(WordWrap.from("Sample text"));
    }

    @Test
    public void fromUtf8Test() {
        InputStream in = new ByteArrayInputStream("Sample text".getBytes(StandardCharsets.UTF_8));
        assertNotNull(WordWrap.fromUtf8(in));
    }

    @Test
    public void fromCharsetTest() {
        InputStream in = new ByteArrayInputStream("Sample text".getBytes());
        assertNotNull(WordWrap.from(in, StandardCharsets.UTF_8));
    }

    @Test
    public void fromFileTest() throws FileNotFoundException {
        File file = new File("testfile.txt");
        assertNotNull(WordWrap.from(file, Charset.defaultCharset()));
    }

    @Test
    public void isWhitespaceTest() {
        assertTrue(WordWrap.isWhitespace(" "));
        assertFalse(WordWrap.isWhitespace("test"));
    }

    @Test
    public void rightTrimTest() {
        CharSequence trimmed = WordWrap.rightTrim("sample   ");
        assertEquals("sample", trimmed.toString());
        trimmed = WordWrap.rightTrim("   sample");
        assertEquals("   sample", trimmed.toString());
    }

    @Test
    public void wordWrapReaderWriterTest() throws IOException {
        Reader reader = new StringReader("wordWrapTest");
        StringWriter writer = new StringWriter();
        HashSet<Character> set = new HashSet<>();
        set.add('-');
        WordWrap.wordWrap(reader, writer, "\n", 80, CharSequence::length, set, true, false);
        assertFalse(writer.toString().isEmpty());
    }

}