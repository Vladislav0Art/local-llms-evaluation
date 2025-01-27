package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class GeneratedTest {

    @Test
    public void fromReaderReturnsBuilder() {
        WordWrap.Builder builder = WordWrap.from(new InputStreamReader(System.in));
        assertNotNull(builder);
    }

    @Test
    public void fromClasspathUtf8ReturnsBuilder() {
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8("resource.txt");
        assertNotNull(builder);
    }

    @Test
    public void fromClasspathReturnsBuilderWithCharset() {
        String resource = "resource.txt";
        Charset charset = StandardCharsets.UTF_8;
        WordWrap.Builder builder = WordWrap.fromClasspath(resource, charset);
        assertEquals(charset, builder.getCharset());
    }

    @Test
    public void fromUtf8InputStreamReturnsBuilder() {
        byte[] bytes = "Hello World!".getBytes();
        InputStream in = new ByteArrayInputStream(bytes);
        WordWrap.Builder builder = WordWrap.fromUtf8(in);
        assertNotNull(builder);
    }

    @Test
    public void fromFileReturnsBuilderWithCharset() throws FileNotFoundException, IOException {
        File file = new File("test.txt");
        Charset charset = StandardCharsets.UTF_8;
        WordWrap.Builder builder = WordWrap.from(file, charset);
        assertNotNull(builder);
    }

    @Test
    public void wordWrapWriterConsumesInputReader() throws IOException {
        Reader in = new InputStreamReader(System.in);
        Writer out = new StringWriter();
        WordWrap.wordWrap(in, out, "\n", 10.0d, (String s) -> 5.0d, new HashSet<>(), false, false);
        assertNotNull(out);
    }

    @Test
    public void wordWrapLineConsumerConsumesInputReader() throws IOException {
        Reader in = new InputStreamReader(System.in);
        LineConsumer out = System.out::println;
        WordWrap.wordWrap(in, out, "\n", 10.0d, (String s) -> 5.0d, new HashSet<>(), false, true);
    }

    @Test
    public void rightTrimEmptyReturnsNull() {
        String input = "";
        String expected = "";
        assertEquals(expected, WordWrap.rightTrim(input));
    }

    @Test
    public void isWhitespaceSpacesOnly() {
        assertTrue(WordWrap.isWhitespace(" "));
        assertFalse(WordWrap.isWhitespace(""));
    }

    @Test
    public void leftTrimStartsWithTrailingSpace() {
        String input = "   ";
        StringBuilder expected = new StringBuilder(input).replace(0, 1, "");
        assertEquals(expected.toString(), WordWrap.leftTrim(new StringBuilder(input)));
    }

}