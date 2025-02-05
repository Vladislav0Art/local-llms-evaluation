package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertEquals;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        Builder builder = WordWrap.from(new StringReader("Hello, world!"));
        assertTrue(builder instanceof Builder);
    }

    @Test
    public void fromClasspathUtf8Test() {
        Builder builder = WordWrap.fromClasspathUtf8("/sample.txt");
        assertTrue(builder instanceof Builder);
    }

    @Test
    public void fromClasspathTest() {
        Builder builder = WordWrap.fromClasspath("/sample.txt", StandardCharsets.UTF_8);
        assertTrue(builder instanceof Builder);
    }

    @Test
    public void fromCharSequenceTest() {
        Builder builder = WordWrap.from("Hello, world!");
        assertTrue(builder instanceof Builder);
    }

    @Test
    public void fromUtf8InputStreamTest() {
        Builder builder = WordWrap.fromUtf8(System.in);
        assertTrue(builder instanceof Builder);
    }

    @Test
    public void fromInputStreamWithCharsetTest() {
        Builder builder = WordWrap.from(System.in, StandardCharsets.UTF_8);
        assertTrue(builder instanceof Builder);
    }

    @Test
    public void fromFileWithCharsetTest() {
        Builder builder = WordWrap.from(new File("./"), StandardCharsets.UTF_8);
        assertTrue(builder instanceof Builder);
    }

    @Test
    public void closeTest() {
        StringReader reader = new StringReader("Hello, world!");
        WordWrap.close(reader);
    }

    @Test
    public void wordWrapTest() throws IOException {
        StringReader reader = new StringReader("Hello, world!");
        StringWriter writer = new StringWriter();
        WordWrap.wordWrap(reader, writer, "\n", 80, s -> s.length(), new HashSet<>(), false, false);
        assertEquals("Hello, world!", writer.toString().trim());
    }

    @Test
    public void rightTrimTest() {
        CharSequence trimmed = WordWrap.rightTrim("   Sample Text   ");
        assertEquals("   Sample Text", trimmed.toString());
    }

    @Test
    public void isWhitespaceTest() {
        assertTrue(WordWrap.isWhitespace("   "));
        assertFalse(WordWrap.isWhitespace("Hello, World!"));
    }

}