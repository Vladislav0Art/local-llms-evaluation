package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;
import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;

import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        Reader reader = mock(Reader.class);
        WordWrap.from(reader);
        Mockito.verifyZeroInteractions(reader);
    }

    @Test
    public void fromClasspathUtf8Test() {
        Builder builder = WordWrap.fromClasspathUtf8("resource");
        assertNotNull(builder);
    }

    @Test
    public void fromClasspathCharsetTest() {
        Builder builder = WordWrap.fromClasspath("resource", StandardCharsets.UTF_8);
        assertNotNull(builder);
    }

    @Test
    public void fromCharSequenceTest() {
        Builder builder = WordWrap.from("text");
        assertNotNull(builder);
    }

    @Test
    public void fromUtf8Test() {
        InputStream in = mock(InputStream.class);
        Builder builder = WordWrap.fromUtf8(in);
        assertNotNull(builder);
    }

    @Test
    public void fromInputStreamCharsetTest() {
        InputStream in = mock(InputStream.class);
        Builder builder = WordWrap.from(in, StandardCharsets.UTF_8);
        assertNotNull(builder);
    }

    @Test
    public void fromFileCharsetTest() {
        File file = mock(File.class);
        Builder builder = WordWrap.from(file, StandardCharsets.UTF_8);
        assertNotNull(builder);
    }

    @Test
    public void fromReaderCloseTrueTest() {
        Reader reader = mock(Reader.class);
        WordWrap.from(reader, true);
        Mockito.verifyZeroInteractions(reader);
    }

    @Test
    public void fromReaderCloseFalseTest() {
        Reader reader = mock(Reader.class);
        WordWrap.from(reader, false);
    }

    @Test
    public void isWhitespaceTest() {
        assertTrue(WordWrap.isWhitespace(" "));
        assertFalse(WordWrap.isWhitespace("not empty string"));
    }

}