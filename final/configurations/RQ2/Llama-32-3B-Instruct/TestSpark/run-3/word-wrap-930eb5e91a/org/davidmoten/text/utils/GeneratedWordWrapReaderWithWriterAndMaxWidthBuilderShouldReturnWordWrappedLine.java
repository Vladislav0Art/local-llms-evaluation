package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedWordWrapReaderWithWriterAndMaxWidthBuilderShouldReturnWordWrappedLine {

    @Test
    public void wordWrapReaderWithWriterAndMaxWidthBuilderShouldReturnWordWrappedLine() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        try (WordWrap.Writer writer = WordWrap.writer(new String[]{"Hello", "World"}, 10)) {
            WordWrap.wordWrap(WordWrap.from(new String[]{"Hello", "World"}).writer(), writer, "\n", 10,
                    (s) -> s.length(), new HashSet<>(), false, true);
        }
        assertEquals("He\ncell\no Wo", outContent.toString(StandardCharsets.UTF_8));
    }

}