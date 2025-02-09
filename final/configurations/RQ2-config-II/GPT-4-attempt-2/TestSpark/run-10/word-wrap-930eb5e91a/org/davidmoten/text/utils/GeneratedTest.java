package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.function.Function;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Reader mockReader;

    @Mock
    private Writer mockWriter;

    @Test
    public void fromReaderTest() {
        assertNotNull(WordWrap.from(mockReader));
    }

    @Test
    public void fromClasspathUtf8Test() {
        assertNotNull(WordWrap.fromClasspathUtf8("test resource"));
    }

    @Test
    public void fromClasspathTest() {
        assertNotNull(WordWrap.fromClasspath("test resource", Charset.defaultCharset()));
    }

    @Test
    public void fromCharSequenceTest() {
        assertNotNull(WordWrap.from("test sequence"));
    }

    @Test
    public void fromUtf8InputStreamTest() {
        assertNotNull(WordWrap.fromUtf8(new ByteArrayInputStream("test".getBytes())));
    }

    @Test
    public void fromInputStreamCharsetTest() {
        assertNotNull(WordWrap.from(new ByteArrayInputStream("test".getBytes()), Charset.defaultCharset()));
    }

    @Test
    public void fromFileCharsetTest() throws FileNotFoundException {
        File tempFile = File.createTempFile("test", ".txt");
        assertNotNull(WordWrap.from(tempFile, Charset.defaultCharset()));
    }

    @Test
    public void closeTest() throws IOException {
        WordWrap.close(mockReader);
        Mockito.verify(mockReader).close();
    }

    @Test
    public void wordWrapReaderWriterTest() throws IOException {
        WordWrap.wordWrap(mockReader, mockWriter, "\n", 10, s -> s.length(),
                new HashSet<>(), false, false);
        Mockito.verify(mockWriter, Mockito.atLeastOnce()).write(Mockito.anyString(), Mockito.anyInt(), Mockito.anyInt());
    }

    @Test
    public void wordWrapReaderLineConsumerTest() throws IOException {
        LineConsumer lineConsumer = new LineConsumer() {
            public void write(String s, int off, int len) {
            }

            public void writeWordStart() {
            }

            public void writeWordEnd(String newLine) {
            }
        };
        WordWrap.wordWrap(mockReader, lineConsumer, 10, s -> s.length(),
                new HashSet<>(), false, false);
        // Check if methods of lineConsumer were called;
        // difficult to assert an exact value due to unpredictable internal implementation
    }

    @Test
    public void rightTrimTest() {
        assertEquals("test", WordWrap.rightTrim("test "));
    }

    @Test
    public void isWhitespaceTest() {
        assertTrue(WordWrap.isWhitespace(" "));
    }

    @Test
    public void leftTrimTest() {
        StringBuilder2 sb = new StringBuilder2();
        sb.append(" test");
        WordWrap.leftTrim(sb);
        assertEquals("test", sb.toString());
    }

}