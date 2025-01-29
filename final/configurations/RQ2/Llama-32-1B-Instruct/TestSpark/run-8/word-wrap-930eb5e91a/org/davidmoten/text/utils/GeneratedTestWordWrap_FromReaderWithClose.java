package org.davidmoten.text.utils;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestWordWrap_FromReaderWithClose {

    @Test
    public void testWordWrap_FromReaderWithClose() {
        Builder builder = new WordWrap.Builder();
        when(from(CharSequence.class, "hello world", StandardCharsets.UTF_8, true)).thenReturn(builder);
        String result = builder.wordWrap(Readers.reader("hello world", StandardCharsets.UTF_8));
        assertEquals("hello world", result.toString());
    }

}