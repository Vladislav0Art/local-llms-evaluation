package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        assertNotNull(WordWrap.from(new StringReader("test data")));
    }

    @Test
    public void fromClasspathUtf8Test() {
        assertNotNull(WordWrap.fromClasspathUtf8("res/sample.txt"));
    }

    @Test
    public void fromClasspathTest() {
        assertNotNull(WordWrap.fromClasspath("res/sample.txt", StandardCharsets.UTF_8));
    }

    @Test
    public void fromCharSequenceTest() {
        assertNotNull(WordWrap.from("test data"));
    }

    @Test
    public void fromUtf8Test() {
        assertNotNull(WordWrap.fromUtf8(System.in));
    }

    @Test
    public void fromInputStreamTest() {
        assertNotNull(WordWrap.from(System.in, StandardCharsets.UTF_8));
    }

    @Test
    public void fromFileTest() {
        assertNotNull(WordWrap.from(new File("test.txt"), StandardCharsets.UTF_8));
    }

    @Test
    public void fromReaderWithCloseTest() {
        assertNotNull(WordWrap.from(new StringReader("test data"), true));
    }

    @Test
    public void rightTrimTest() {
        CharSequence result = WordWrap.rightTrim("   test data    ");
        assertEquals("   test data", result.toString());
    }

    @Test
    public void isWhiteSpaceTest() {
        assertTrue(WordWrap.isWhitespace("    "));
        assertFalse(WordWrap.isWhitespace(" test data "));
    }

    @Test
    public void leftTrimTest() {
        StringBuilder2 stringBuilder2 = new StringBuilder2();
        stringBuilder2.append("     test data");
        WordWrap.leftTrim(stringBuilder2);
        assertEquals("test data", stringBuilder2.toString());
    }

    @Test
    public void wordWrapTest() throws IOException {
        StringReader stringReader = new StringReader("test data");
        StringWriter stringWriter = new StringWriter();
        Set<Character> extraWordChars = new HashSet<>();
        extraWordChars.add(',');
        WordWrap.wordWrap(stringReader, stringWriter, "\n", 80, CharSequence::length, extraWordChars, true, false);
    }

}