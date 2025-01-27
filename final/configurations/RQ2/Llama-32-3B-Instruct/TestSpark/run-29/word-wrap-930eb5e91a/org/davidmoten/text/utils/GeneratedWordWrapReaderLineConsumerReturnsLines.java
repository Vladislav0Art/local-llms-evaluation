package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedWordWrapReaderLineConsumerReturnsLines {

    @Test
    public void wordWrapReaderLineConsumerReturnsLines() throws IOException {
        Reader in = new ByteArrayInputStream("This is a very long string that will be wrapped.".getBytes(StandardCharsets.UTF_8));
        StringBuilder lineConsumer = new StringBuilder();
        Set<Character> extraWordChars = new HashSet<>();
        String newLine = "\n";
        Number maxWidth = 20L;
        Function<? super CharSequence, ? extends Number> stringWidth = s -> s.length();
        boolean insertHyphens = false;
        boolean breakWords = true;
        WordWrap.wordWrap(in, lineConsumer, newLine, maxWidth, stringWidth, extraWordChars, insertHyphens, breakWords);
        assertEquals(1, lineConsumer.length());
    }

}