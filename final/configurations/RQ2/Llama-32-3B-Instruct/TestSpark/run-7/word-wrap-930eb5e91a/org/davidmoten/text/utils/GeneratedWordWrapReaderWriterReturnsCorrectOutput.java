package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedWordWrapReaderWriterReturnsCorrectOutput {

    @Test
    public void wordWrapReaderWriterReturnsCorrectOutput() throws IOException {
        String input = "Hello World";
        WordWrap.wordWrap(reader, writer, "\n", 10L, s -> s.length(), new HashSet<>(), false, true);
        assertEquals(input + "\n", reader.toString());
    }

}