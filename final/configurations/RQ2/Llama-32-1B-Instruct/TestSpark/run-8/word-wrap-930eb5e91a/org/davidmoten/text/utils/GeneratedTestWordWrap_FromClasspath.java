package org.davidmoten.text.utils;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestWordWrap_FromClasspath {

    @Test
    public void testWordWrap_FromClasspath() {
        Builder builder = new WordWrap.Builder();
        when(fromClasspath(CharSequence.class, "resource.txt", StandardCharsets.UTF_8)).thenReturn(builder);
        String result = builder.wordWrap(Readers.reader("hello world", StandardCharsets.UTF_8));
        assertEquals("hello world", result.toString());
    }

}