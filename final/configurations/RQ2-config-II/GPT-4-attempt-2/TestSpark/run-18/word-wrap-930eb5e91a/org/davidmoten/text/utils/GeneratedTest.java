package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.function.Function;
import java.io.BufferedReader;
import java.io.IOException;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        assertNotNull(WordWrap.from(new StringReader("Test data")));
    }

    @Test
    public void fromCharSequenceTest() {
        assertNotNull(WordWrap.from("Test data"));
    }

    @Test
    public void fromInputStreamUtf8Test() {
        String input = "Test data";
        assertNotNull(WordWrap.fromUtf8(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8))));
    }

    @Test
    public void fromInputStreamCharsetTest() {
        String input = "Test data";
        assertNotNull(WordWrap.from(InputStreamUtil.toStream(input), StandardCharsets.UTF_8));
    }

    @Test
    public void fromReaderAndCloseTest() {
        StringReader reader = new StringReader("Test data");
        assertNotNull(WordWrap.from(reader, true));
    }

    @Test
    public void closeTest() {
        StringReader reader = new StringReader("Test data");
        WordWrap.close(reader);
    }

    @Test
    public void wordWrapLineConsumerTest() throws IOException {
        StringReader in = new StringReader("Test data");
        StringWriter writer = new StringWriter();
        LineConsumer consumer = new LineConsumer(writer);
        Function<CharSequence, Number> stringWidth = s -> s.length();
        WordWrap.wordWrap(in, consumer, 10, stringWidth, Collections.emptySet(), false, false);
        assertEquals("Test data", writer.toString());
    }

    @Test
    public void wordWrapWriterTest() throws IOException {
        StringReader in = new StringReader("Test data");
        StringWriter writer = new StringWriter();
        Function<CharSequence, Number> stringWidth = s -> s.length();
        WordWrap.wordWrap(in, writer, "n", 10, stringWidth, Collections.emptySet(), false, false);
        assertEquals("Test data", writer.toString());
    }

    @Test
    public void rightTrimTest() {
        CharSequence trimmed = WordWrap.rightTrim("   Test data   ");
        assertEquals("   Test data", trimmed.toString());
    }

    @Test
    public void isWhitespaceTest() {
        boolean result = WordWrap.isWhitespace("Test data");
        assertFalse(result);
    }

    @Test
    public void isWhitespaceAllSpacesTest() {
        boolean result = WordWrap.isWhitespace("       ");
        assertTrue(result);
    }

    @Test
    public void leftTrimTest() {
        StringBuilder2 word = new StringBuilder2("   Test data   ");
        WordWrap.leftTrim(word);
        assertEquals("Test data   ", word.toString());
    }

}