package org.davidmoten.text.utils;

import org.junit.Test;
import org.davidmoten.text.utils.WordWrap;

import static org.junit.Assert.*;

import java.io.File;
import java.io.StringReader;
import java.io.Writer;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        assertNotNull(WordWrap.from(new StringReader("Test String")));
    }

    @Test
    public void fromClasspathUtf8Test() {
        assertNotNull(WordWrap.fromClasspathUtf8("Test String"));
    }

    @Test
    public void fromClasspathCharsetTest() {
        assertNotNull(WordWrap.fromClasspath("Test String", StandardCharsets.UTF_8));
    }

    @Test
    public void fromCharSequenceTest() {
        assertNotNull(WordWrap.from("Test String"));
    }

    @Test
    public void fromInputStreamTest() {
        assertNotNull(WordWrap.fromUtf8(System.in));
    }

    @Test
    public void fromInputStreamCharsetTest() {
        assertNotNull(WordWrap.from(System.in, StandardCharsets.UTF_8));
    }

    @Test
    public void fromFileCharsetTest() {
        assertNotNull(WordWrap.from(new File("test.txt"), StandardCharsets.UTF_8));
    }

    @Test
    public void isWhitespaceTest() {
        assertTrue(WordWrap.isWhitespace(" "));
        assertFalse(WordWrap.isWhitespace("Test"));
    }

    @Test
    public void rightTrimTest() {
        assertEquals("Test", WordWrap.rightTrim("Test "));
        assertEquals(" Test", WordWrap.rightTrim(" Test"));
        assertEquals("Test", WordWrap.rightTrim("Test"));
    }

    @Test
    public void leftTrimTest() {
        StringBuilder2 word = new StringBuilder2(" Test");
        WordWrap.leftTrim(word);
        assertEquals("Test", word.toString());
    }

    @Test
    public void wordWrapIOExceptionTest() throws IOException {
        WordWrap.wordWrap(null, null, null, null, null, new HashSet<Character>(), false, false);
    }

}