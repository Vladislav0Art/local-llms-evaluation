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
        assertNotNull(WordWrap.from(Mockito.mock(Reader.class)));
    }

    @Test
    public void fromClasspathUtf8Test() {
        assertNotNull(WordWrap.fromClasspathUtf8("test"));
    }

    @Test
    public void fromClasspathTest() {
        assertNotNull(WordWrap.fromClasspath("test", StandardCharsets.UTF_8));
    }

    @Test
    public void fromCharSequenceTest() {
        assertNotNull(WordWrap.from("text"));
    }

    @Test
    public void fromUtf8Test() {
        assertNotNull(WordWrap.fromUtf8(Mockito.mock(InputStream.class)));
    }

    @Test
    public void fromInputStreamCharsetTest() {
        assertNotNull(WordWrap.from(Mockito.mock(InputStream.class), StandardCharsets.UTF_8));
    }

    @Test
    public void fromFileTest() {
        assertNotNull(WordWrap.from(Mockito.mock(File.class), StandardCharsets.UTF_8));
    }

    @Test
    public void rightTrimTest() {
        assertEquals("test", WordWrap.rightTrim("test "));
    }

    @Test
    public void isWhitespaceTest() {
        assertTrue(WordWrap.isWhitespace("  "));
        assertFalse(WordWrap.isWhitespace("Text"));
    }

    @Test
    public void wordWrapReaderTest() {
        Set<Character> extras = new HashSet<>();
        extras.add('-');
        try {
            StringReader in = new StringReader("This is a fairly long piece of text that needs wrapping");
            StringWriter out = new StringWriter();
            WordWrap.wordWrap(in, out, "\n", 10,
                    (cs -> cs.length()), extras, true, true);
            assertEquals("This is a \nfairly long \npiece of \ntext that \nneeds \nwrapping", out.toString());
        } catch (IOException e) {
            fail();
        }
    }

    @Test
    public void wordWrapLineConsumerTest() {
        Set<Character> extras = new HashSet<>();
        extras.add('-');
        try {
            StringReader in = new StringReader("This is a fairly long piece of text that needs wrapping");
            StringWriter out = new StringWriter();
            LineConsumer consumer = Mockito.mock(LineConsumer.class);
            WordWrap.wordWrap(in, consumer, 10,
                    (cs -> cs.length()), extras, true, true);
            Mockito.verify(consumer, Mockito.times(6)).accept(Mockito.anyString());
        } catch (IOException e) {
            fail();
        }
    }

}