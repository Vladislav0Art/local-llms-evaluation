package org.davidmoten.text.utils;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestWordWrap_FromLineConsumerWithBreakWordsAndInsertHyphens {

    @Test
    public void testWordWrap_FromLineConsumerWithBreakWordsAndInsertHyphens() {
        Builder builder = new WordWrap.Builder();
        when(from(Readers.reader(new LineReader("hello world\n", StandardCharsets.UTF_8), StandardCharsets.UTF_8), true)).thenReturn(builder);
        String result = builder.wordWrap(Readers.reader(new LineReader("hello world\n", StandardCharsets.UTF_8), StandardCharsets.UTF_8),
                (line) -> line.trim());
        assertEquals("hello-world", result.toString());
    }

}