package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.function.Function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        Reader reader = new StringReader("Test");
        assertEquals(WordWrap.Builder.class, WordWrap.from(reader).getClass());
    }

    @Test
    public void fromClasspathUtf8Test() {
        assertEquals(WordWrap.Builder.class, WordWrap.fromClasspathUtf8("test-resource").getClass());
    }

    @Test
    public void fromClasspathTest() {
        assertEquals(WordWrap.Builder.class, WordWrap.fromClasspath("test-resource", StandardCharsets.UTF_8).getClass());
    }

    @Test
    public void fromCharSequenceTest() {
        assertEquals(WordWrap.Builder.class, WordWrap.from("Test").getClass());
    }

    @Test
    public void fromUtf8Test() {
        assertEquals(WordWrap.Builder.class, WordWrap.fromUtf8(System.in).getClass());
    }

    @Test
    public void fromInputStreamCharsetTest() {
        assertEquals(WordWrap.Builder.class, WordWrap.from(System.in, StandardCharsets.UTF_8).getClass());
    }

    @Test
    public void closeTest() {
        Reader reader = Mockito.mock(Reader.class);
        WordWrap.close(reader);
        Mockito.verify(reader, Mockito.times(1)).close();
    }

    @Test
    public void rightTrimTest() {
        assertEquals("Test", WordWrap.rightTrim("Test   ").toString());
    }

    @Test
    public void isWhitespaceTest() {
        assertTrue(WordWrap.isWhitespace("    "));
    }

    @Test
    public void wordWrapReaderTest() throws IOException {
        Reader reader = new StringReader("This is a test");
        Writer writer = new StringWriter();
        Function<CharSequence, Integer> fun = s -> s.length();
        WordWrap.wordWrap(reader, writer, "\n", 10, fun, Collections.emptySet(), false, true);
        assertEquals("This\nis a\ntest\n", writer.toString());
    }

    @Test
    public void wordWrapLineConsumerTest() throws IOException {
        Reader reader = new StringReader("This is another test");
        LineConsumer consumer = Mockito.mock(LineConsumer.class);
        Function<CharSequence, Integer> fun = s -> s.length();
        WordWrap.wordWrap(reader, consumer, 10, fun, Collections.emptySet(), false, true);
        Mockito.verify(consumer, Mockito.times(3)).accept(Mockito.anyString());
    }

}