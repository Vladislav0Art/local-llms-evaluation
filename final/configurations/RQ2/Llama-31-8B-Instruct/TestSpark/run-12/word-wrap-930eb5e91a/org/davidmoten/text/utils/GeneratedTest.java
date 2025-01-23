package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        java.io.Reader reader = mock(java.io.Reader.class);
        org.davidmoten.text.utils.WordWrap.Builder builder = org.davidmoten.text.utils.WordWrap.from(reader);
        assertNotNull(builder);
    }

    @Test
    public void fromClasspathUtf8Test() {
        String resource = "test.txt";
        org.davidmoten.text.utils.WordWrap.Builder builder = org.davidmoten.text.utils.WordWrap.fromClasspathUtf8(resource);
        assertNotNull(builder);
    }

    @Test
    public void fromClasspathTest() {
        String resource = "test.txt";
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
        org.davidmoten.text.utils.WordWrap.Builder builder = org.davidmoten.text.utils.WordWrap.fromClasspath(resource, charset);
        assertNotNull(builder);
    }

    @Test
    public void fromTextTest() {
        String text = "Hello World!";
        org.davidmoten.text.utils.WordWrap.Builder builder = org.davidmoten.text.utils.WordWrap.from(text);
        assertNotNull(builder);
    }

    @Test
    public void fromInputStreamTest() {
        java.io.InputStream in = mock(java.io.InputStream.class);
        org.davidmoten.text.utils.WordWrap.Builder builder = org.davidmoten.text.utils.WordWrap.fromUtf8(in);
        assertNotNull(builder);
    }

    @Test
    public void fromInputStreamWithCharsetTest() {
        java.io.InputStream in = mock(java.io.InputStream.class);
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
        org.davidmoten.text.utils.WordWrap.Builder builder = org.davidmoten.text.utils.WordWrap.from(in, charset);
        assertNotNull(builder);
    }

    @Test
    public void fromFileTest() {
        java.io.File file = new java.io.File("test.txt");
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
        org.davidmoten.text.utils.WordWrap.Builder builder = org.davidmoten.text.utils.WordWrap.from(file, charset);
        assertNotNull(builder);
    }

}