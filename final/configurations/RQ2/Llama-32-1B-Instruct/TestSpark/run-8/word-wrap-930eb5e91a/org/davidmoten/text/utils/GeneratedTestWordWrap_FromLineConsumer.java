package org.davidmoten.text.utils;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestWordWrap_FromLineConsumer {

    @Test
    public void testWordWrap_FromLineConsumer() {
        Builder builder = new WordWrap.Builder();
        when(from(Readers.reader(new LineReader("hello world\n", StandardCharsets.UTF_8), StandardCharsets.UTF_8))).thenReturn(builder);
        String result = builder.wordWrap(Readers.reader(new LineReader("hello world\n", StandardCharsets.UTF_8), StandardCharsets.UTF_8));
        assertEquals("hello world", result.toString());
    }

}