package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        Reader reader = new StringReader("test");
        assertNotNull(WordWrap.from(reader));
    }

    @Test
    public void fromClasspathUtf8Test() {
        assertNotNull(WordWrap.fromClasspathUtf8("."));
    }

    @Test
    public void fromClasspathTest() {
        assertNotNull(WordWrap.fromClasspath(".", StandardCharsets.UTF_8));
    }

    @Test
    public void fromCharSequenceTest() {
        assertNotNull(WordWrap.from("test"));
    }

    @Test
    public void fromUtf8InputStreamTest() {
        assertNotNull(WordWrap.fromUtf8(new ByteArrayInputStream(new byte[0])));
    }

    @Test
    public void fromInputStreamTest() {
        assertNotNull(WordWrap.from(new ByteArrayInputStream(new byte[0]), StandardCharsets.UTF_8));
    }

    @Test
    public void fromFileTest() {
        File file = new File("test.txt");
        assertNotNull(WordWrap.from(file, Charset.defaultCharset()));
    }

    @Test
    public void wordWrapIOExceptionTest() throws IOException {
        Reader reader = Mockito.mock(Reader.class);
        Writer writer = Mockito.mock(Writer.class);
        Function function = Mockito.mock(Function.class);
        Set<Character> set = new HashSet<>();
        Mockito.when(reader.read()).thenThrow(new IOException());

        WordWrap.wordWrap(reader, writer, "\n", 80, function, set, true, true);
    }

    @Test
    public void rightTrimTest() {
        assertEquals("test", WordWrap.rightTrim("test "));
    }

    @Test
    public void isWhitespaceTrueTest() {
        assertTrue(WordWrap.isWhitespace(" "));
    }

    @Test
    public void isWhitespaceFalseTest() {
        assertFalse(WordWrap.isWhitespace("test"));
    }

    @Test
    public void wordWrapLineConsumerIOException() throws IOException {
        Reader reader = Mockito.mock(Reader.class);
        WordWrap.LineConsumer consumer = Mockito.mock(WordWrap.LineConsumer.class);
        WordWrap.wordWrap(reader, consumer, 5, Formatter::countWidth, new HashSet<>(), false, false);
    }

    @Test
    public void closeReaderTest() {
        Reader reader = Mockito.mock(Reader.class);
        WordWrap.close(reader);
        Mockito.verify(reader, Mockito.atLeastOnce()).close();
    }

}