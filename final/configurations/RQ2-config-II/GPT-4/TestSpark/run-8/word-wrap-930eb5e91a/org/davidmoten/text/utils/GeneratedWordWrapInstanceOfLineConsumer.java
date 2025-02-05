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

public class GeneratedWordWrapInstanceOfLineConsumer {

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