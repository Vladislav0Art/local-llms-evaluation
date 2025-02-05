package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        String text = "Hello World";
        StringReader stringReader = new StringReader(text);

        assertEquals(WordWrap.from(stringReader), WordWrap.from(text));
    }

    @Test
    public void fromInputStreamCharsetTest() {
        String text = "Hello World";
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(text.getBytes());

        assertEquals(WordWrap.from(byteArrayInputStream, StandardCharsets.UTF_8), WordWrap.from(text));
    }

    @Test
    public void isWhitespaceTest() {
        CharSequence text = "          ";
        assertEquals(WordWrap.isWhitespace(text), true);
        text = "Hello World";
        assertEquals(WordWrap.isWhitespace(text), false);
    }

    @Test
    public void wordWrapReaderWriterIOEExceptionTest() throws IOException {
        String input = "Hello World this is a long string which will exceed max width";
        StringReader stringReader = new StringReader(input);
        StringWriter stringWriter = new StringWriter();

        WordWrap.wordWrap(stringReader, stringWriter, "\n", 10, CharSequence::length, new HashSet<>(), false, true);
    }

    @Test
    public void wordWrapInstanceOfLineConsumer() throws IOException {
        String text = "Hello World!";
        StringReader stringReader = new StringReader(text);
        StringReader spyStringReader = Mockito.spy(stringReader);
        WordWrap.LineConsumer mockLineConsumer = Mockito.mock(WordWrap.LineConsumer.class);
        Number charSequenceLength = text.length();

        WordWrap.wordWrap(spyStringReader, mockLineConsumer, charSequenceLength,
                CharSequence::length, new HashSet<>(), false, false);
        Mockito.verify(mockLineConsumer, Mockito.times(1)).accept(Mockito.anyString());
    }

}