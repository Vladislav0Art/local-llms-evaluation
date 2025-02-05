package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        Reader reader = new StringReader("Test");
        assertNotNull(WordWrap.from(reader));
    }

    @Test
    public void fromClasspathUtf8Test() {
        assertNotNull(WordWrap.fromClasspathUtf8("/test.txt"));
    }

    @Test
    public void fromClasspathTest() {
        assertNotNull(WordWrap.fromClasspath("/test.txt", StandardCharsets.UTF_8));
    }

    @Test
    public void fromCharSequenceTest() {
        assertNotNull(WordWrap.from("Test"));
    }

    @Test
    public void fromUtf8InputStreamTest() {
        InputStream in = new ByteArrayInputStream("Test".getBytes());
        assertNotNull(WordWrap.fromUtf8(in));
    }

    @Test
    public void fromInputStreamCharSetTest() {
        InputStream in = new ByteArrayInputStream("Test".getBytes());
        assertNotNull(WordWrap.from(in, StandardCharsets.UTF_8));
    }

    @Test
    public void fromFileCharSetTest() throws FileNotFoundException {
        File file = Mockito.mock(File.class);
        assertNotNull(WordWrap.from(file, StandardCharsets.UTF_8));
    }

    @Test
    public void closeReaderTest() {
        Reader reader = Mockito.mock(Reader.class);
        WordWrap.close(reader);
        Mockito.verify(reader, Mockito.times(1)).close();
    }

    @Test
    public void rightTrimCharSequenceTest() {
        CharSequence charSequence = new StringBuilder("Test  ");
        assertEquals("Test", WordWrap.rightTrim(charSequence));
    }

    @Test
    public void isWhitespaceCharSequenceTest() {
        CharSequence charSequence = new StringBuilder("  ");
        assertTrue(WordWrap.isWhitespace(charSequence));
    }

    @Test
    public void leftTrimStringBuilder2Test() {
        StringBuilder2 stringBuilder2 = new StringBuilder2("  Test");
        WordWrap.leftTrim(stringBuilder2);
        assertEquals("Test", stringBuilder2.toString());
    }

}