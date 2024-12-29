package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void fromClasspathUtf8Test() {
        String resource = "test.txt";
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8(resource);
        assertNotNull(builder);
    }

    @Test
    public void fromCharSequenceTest() {
        String text = "Hello World!";
        WordWrap.Builder builder = WordWrap.from(text);
        assertNotNull(builder);
    }

    @Test
    public void fromClasspathTest() {
        String resource = "test.txt";
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
        WordWrap.Builder builder = WordWrap.fromClasspath(resource, charset);
        assertNotNull(builder);
    }

    @Test
    public void fromInputStreamTest() {
        java.io.InputStream in = mock(java.io.InputStream.class);
        WordWrap.Builder builder = WordWrap.fromUtf8(in);
        assertNotNull(builder);
    }

    @Test
    public void fromInputStreamWithCharsetTest() {
        java.io.InputStream in = mock(java.io.InputStream.class);
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
        WordWrap.Builder builder = WordWrap.from(in, charset);
        assertNotNull(builder);
    }

    @Test
    public void fromFileTest() {
        java.io.File file = new java.io.File("test.txt");
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
        WordWrap.Builder builder = WordWrap.from(file, charset);
        assertNotNull(builder);
    }

    @Test
    public void fromReaderCloseTest() {
        java.io.Reader reader = mock(java.io.Reader.class);
        WordWrap.Builder builder = WordWrap.from(reader, true);
        assertNotNull(builder);
    }

    @Test
    public void fromReaderTest() {
        java.io.Reader reader = mock(java.io.Reader.class);
        WordWrap.Builder builder = WordWrap.from(reader);
        assertNotNull(builder);
    }

}