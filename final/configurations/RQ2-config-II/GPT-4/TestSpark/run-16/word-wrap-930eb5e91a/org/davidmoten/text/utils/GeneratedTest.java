package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        assertTrue(WordWrap.from(new StringReader("")).getClass().getName().contains("Builder"));
    }

    @Test
    public void fromClasspathUtf8Test() {
        assertTrue(WordWrap.fromClasspathUtf8("/resource").getClass().getName().contains("Builder"));
    }

    @Test
    public void fromClasspathTest() {
        assertTrue(WordWrap.fromClasspath("/resource", StandardCharsets.UTF_8).getClass().getName().contains("Builder"));
    }

    @Test
    public void fromTextTest() {
        assertTrue(WordWrap.from("Test text").getClass().getName().contains("Builder"));
    }

    @Test
    public void fromInputStreamTest() {
        assertTrue(WordWrap.fromUtf8(System.in).getClass().getName().contains("Builder"));
    }

    @Test
    public void fromCharsetInputStreamTest() {
        assertTrue(WordWrap.from(System.in, StandardCharsets.UTF_8).getClass().getName().contains("Builder"));
    }

    @Test
    public void fromFileCharsetTest() {
        assertTrue(WordWrap.from(new File("TestFile.txt"), StandardCharsets.UTF_8).getClass().getName().contains("Builder"));
    }

    @Test
    public void rightTrimTest() {
        assertEquals("test string", WordWrap.rightTrim("test string     "));
    }

    @Test
    public void isWhitespaceTest() {
        assertTrue(WordWrap.isWhitespace("     "));
        assertFalse(WordWrap.isWhitespace("test string"));
    }

    @Test
    public void leftTrimTest() {
        StringBuilder2 string = new StringBuilder2("     test string");
        WordWrap.leftTrim(string);
        assertEquals("test string", string.toString());
    }

    @Test
    public void wordWrapTest() throws IOException {
        StringReader in = new StringReader("Hello World");
        StringWriter out = new StringWriter();
        WordWrap.wordWrap(in, out, "\n", 5, s -> s.length(), new HashSet<>(), false, false);
        assertEquals("Hello\nWorld", out.toString());
    }

}