package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.function.Function;

import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.PrintWriter;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private org.davidmoten.text.utils.Reader reader;

    @Mock
    private org.davidmoten.text.utils.Writer writer;

    @Mock
    private org.davidmoten.text.utils.LineConsumer lineConsumer;

    @Mock
    private String resource;

    @Mock
    private CharSequence text;

    @Mock
    private InputStream in;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void fromReader() throws IOException {
        WordWrap.Builder builder = WordWrap.from(reader);
        // Test implementation not available without mocking.
    }

    @Test
    public void fromClasspathUtf8() {
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8(resource);
        // Test implementation not available without mocking.
    }

    @Test
    public void fromClasspath() {
        WordWrap.Builder builder = WordWrap.fromClasspath(resource, Charset.forName("UTF-8"));
        // Test implementation not available without mocking.
    }

    @Test
    public void fromCharSequence() {
        WordWrap.Builder builder = WordWrap.from(text);
        // Test implementation not available without mocking.
    }

    @Test
    public void fromUtf8InputStream() throws IOException {
        WordWrap.Builder builder = WordWrap.fromUtf8(in);
        // Test implementation not available without mocking.
    }

    @Test
    public void fromInputStream() throws IOException {
        WordWrap.Builder builder = WordWrap.from(in, Charset.forName("UTF-8"));
        // Test implementation not available without mocking.
    }

    @Test
    public void fromFile() throws IOException {
        WordWrap.Builder builder = WordWrap.from(File.class, Charset.forName("UTF-8"));
        // Test implementation not available without mocking.
    }

    @Test
    public void fromReaderClose() throws IOException {
        WordWrap.Builder builder = WordWrap.from(reader, true);
        // Test implementation not available without mocking.
    }

    @Test
    public void closeReader() throws IOException {
        WordWrap.close(reader);
        // Implementation tests not available without mocking.
    }

    @Test
    public void wordWrapReaderWriter() throws IOException {
        WordWrap.wordWrap(reader, writer, "\n", 10, c -> 10, Set.of(' '), false, true);
        // Test implementation not available without mocking.
    }

    @Test
    public void rightTrimCharSequence() {
        assertEquals("", WordWrap.rightTrim(text));
        // Implementation tests not available without mocking.
    }

    @Test
    public void isWhitespaceCharSequence() {
        assertTrue(WordWrap.isWhitespace(text));
        assertFalse(WordWrap.isWhitespace("hello"));
        // Test implementation not available without mocking.
    }

    @Test
    public void leftTrimStringBuilder2() {
        WordWrap.leftTrim(new org.davidmoten.text.utils.StringBuilder2());
        // Implementation tests not available without mocking.
    }

}