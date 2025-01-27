package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedWordWrapReaderLineConsumerReturnsCorrectOutput {

    @Test
    public void wordWrapReaderLineConsumerReturnsCorrectOutput() throws IOException {
        String input = "Hello World";
        WordWrap.wordWrap(reader, lineConsumer, 10L, s -> s.length(), new HashSet<>(), false, true);
        assertTrue(lineConsumer.isConsumed());
        assertEquals(input + "\n", lineConsumer.getConsumedText());
    }

}