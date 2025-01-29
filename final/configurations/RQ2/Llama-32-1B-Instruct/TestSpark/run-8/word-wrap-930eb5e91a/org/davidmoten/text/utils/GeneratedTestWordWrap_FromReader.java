package org.davidmoten.text.utils;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestWordWrap_FromReader {

    @Test
    public void testWordWrap_FromReader() {
        Builder builder = new WordWrap.Builder();
        when(from(CharSequence.class, "hello world", StandardCharsets.UTF_8)).thenReturn(builder);
        String result = builder.wordWrap(Readers.reader("hello world", StandardCharsets.UTF_8));
        assertEquals("hello world", result.toString());
    }

}