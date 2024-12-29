package org.davidmoten.text.utils;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.StandardCharsets;
import java.io.StringReader;
import java.io.StringWriter;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        StringReader reader = new StringReader("test");
        assertNotNull(WordWrap.from(reader));
    }

    @Test
    public void fromClasspathUtf8Test() {
        assertNotNull(WordWrap.fromClasspathUtf8("test.txt"));
    }

    @Test
    public void fromClasspathCharsetTest() {
        assertNotNull(WordWrap.fromClasspath("test.txt", StandardCharsets.UTF_8));
    }

    @Test
    public void fromCharSequenceTest() {
        assertNotNull(WordWrap.from("test"));
    }

    @Test
    public void fromUtf8StreamTest() {
        assertNotNull(WordWrap.fromUtf8(System.in));
    }

    @Test
    public void fromInputStreamCharsetTest() {
        assertNotNull(WordWrap.from(System.in, StandardCharsets.UTF_8));
    }

    @Test
    public void fromReaderCloseTest() {
        StringReader reader = Mockito.spy(new StringReader("test"));
        assertNotNull(WordWrap.from(reader, true));
        Mockito.verify(reader, Mockito.times(1)).close();
    }

    @Test
    public void closeReaderTest() {
        StringReader reader = Mockito.spy(new StringReader("test"));
        WordWrap.close(reader);
        Mockito.verify(reader, Mockito.times(1)).close();
    }

    @Test
    public void rightTrimTest() {
        CharSequence result = WordWrap.rightTrim(" test  ");
        assertEquals(" test", result);
    }

    @Test
    public void isWhitespaceTest() {
        assertTrue(WordWrap.isWhitespace(" "));
        assertFalse(WordWrap.isWhitespace("a"));
    }

    @Test
    public void leftTrimTest() {
        StringBuilder2 word = new StringBuilder2("  test");
        WordWrap.leftTrim(word);
        assertEquals("test", word.toString());
    }

}