package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class GeneratedTest {

    @Test
    public void fromClasspathUtf8Test() {
        String resource = "test.txt";
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8(resource);
        assertNotNull(builder);
    }

    @Test
    public void fromTextTest() {
        String text = "Hello World!";
        WordWrap.Builder builder = WordWrap.from(text);
        assertNotNull(builder);
    }

    @Test
    public void fromReaderTest() {
        Reader reader = mock(Reader.class);
        WordWrap.Builder builder = WordWrap.from(reader);
        assertNotNull(builder);
    }

    @Test
    public void fromClasspathTest() {
        String resource = "test.txt";
        Charset charset = StandardCharsets.UTF_8;
        WordWrap.Builder builder = WordWrap.fromClasspath(resource, charset);
        assertNotNull(builder);
    }

    @Test
    public void fromInputStreamTest() throws Exception {
        InputStream in = mock(InputStream.class);
        WordWrap.Builder builder = WordWrap.fromUtf8(in);
        assertNotNull(builder);
    }

    @Test
    public void fromInputStreamWithCharsetTest() throws Exception {
        InputStream in = mock(InputStream.class);
        Charset charset = StandardCharsets.UTF_8;
        WordWrap.Builder builder = WordWrap.from(in, charset);
        assertNotNull(builder);
    }

    @Test
    public void fromFileTest() throws Exception {
        File file = new File("test.txt");
        Charset charset = StandardCharsets.UTF_8;
        WordWrap.Builder builder = WordWrap.from(file, charset);
        assertNotNull(builder);
    }

    @Test
    public void fromReaderCloseTest() {
        Reader reader = mock(Reader.class);
        WordWrap.Builder builder = WordWrap.from(reader, true);
        assertNotNull(builder);
    }

}