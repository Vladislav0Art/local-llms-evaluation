package org.davidmoten.text.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

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
    public void fromTextTest() {
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
    public void fromInputStreamTest() throws java.io.IOException {
        java.io.InputStream in = mock(java.io.InputStream.class);
        WordWrap.Builder builder = WordWrap.fromUtf8(in);
        assertNotNull(builder);
    }

    @Test
    public void fromInputStreamWithCharsetTest() throws java.io.IOException {
        java.io.InputStream in = mock(java.io.InputStream.class);
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
        WordWrap.Builder builder = WordWrap.from(in, charset);
        assertNotNull(builder);
    }

    @Test
    public void fromFileTest() throws java.io.IOException {
        java.io.File file = new java.io.File("test.txt");
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
        WordWrap.Builder builder = WordWrap.from(file, charset);
        assertNotNull(builder);
    }

}