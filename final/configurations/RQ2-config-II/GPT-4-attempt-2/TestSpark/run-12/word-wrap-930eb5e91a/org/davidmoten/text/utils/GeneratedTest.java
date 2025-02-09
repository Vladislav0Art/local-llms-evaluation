package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Collections;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        Reader reader = new StringReader("Test input");
        assertNotNull(WordWrap.from(reader));
    }

    @Test
    public void fromClasspathUtf8Test() {
        assertNotNull(WordWrap.fromClasspathUtf8("Test resource"));
    }

    @Test
    public void fromClasspathTest() {
        assertNotNull(WordWrap.fromClasspath("Test resource", StandardCharsets.UTF_8));
    }

    @Test
    public void fromCharSequenceTest() {
        assertNotNull(WordWrap.from("Test text"));
    }

    @Test
    public void fromUtf8InputStreamTest() {
        InputStream in = new ByteArrayInputStream("Test input".getBytes());
        assertNotNull(WordWrap.fromUtf8(in));
    }

    @Test
    public void fromInputStreamTest() {
        InputStream in = new ByteArrayInputStream("Test input".getBytes());
        assertNotNull(WordWrap.from(in, StandardCharsets.UTF_8));
    }

    @Test
    public void fromFileTest() throws FileNotFoundException {
        File file = Mockito.mock(File.class);
        assertNotNull(WordWrap.from(file, StandardCharsets.UTF_8));
    }

    @Test
    public void rightTrimNullInputTest() {
        WordWrap.rightTrim(null);
    }

    @Test
    public void rightTrimEmptyInputTest() {
        CharSequence trimmed = WordWrap.rightTrim("");
        assertNotNull(trimmed);
        assertEquals("", trimmed.toString());
    }

    @Test
    public void rightTrimWithWhiteSpacesTest() {
        CharSequence trimmed = WordWrap.rightTrim("    ");
        assertNotNull(trimmed);
        assertEquals("", trimmed.toString());
    }

    @Test
    public void rightTrimWithTrailingWhiteSpacesTest() {
        CharSequence trimmed = WordWrap.rightTrim("Test    ");
        assertNotNull(trimmed);
        assertEquals("Test", trimmed.toString());
    }

    @Test
    public void isWhitespaceNullInputTest() {
        WordWrap.isWhitespace(null);
    }

    @Test
    public void isWhitespaceEmptyInputTest() {
        assertTrue(WordWrap.isWhitespace(""));
    }

    @Test
    public void isWhitespaceWithNonWhiteSpaceTest() {
        assertFalse(WordWrap.isWhitespace("Test"));
    }

}