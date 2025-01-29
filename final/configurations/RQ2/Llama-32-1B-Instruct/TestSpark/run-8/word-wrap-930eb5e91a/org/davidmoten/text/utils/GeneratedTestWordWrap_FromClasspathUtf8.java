package org.davidmoten.text.utils;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestWordWrap_FromClasspathUtf8 {

    @Test
    public void testWordWrap_FromClasspathUtf8() {
        Builder builder = new WordWrap.Builder();
        when(fromClasspath(CharSequence.class, "resource.txt")).thenReturn(builder);
        String result = builder.wordWrap(Readers.reader("hello world", StandardCharsets.UTF_8));
        assertEquals("hello world", result.toString());
    }

}