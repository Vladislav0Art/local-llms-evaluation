package org.davidmoten.text.utils;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestWordWrap_FromReaderLineConsumerWithClose {

    @Test
    public void testWordWrap_FromReaderLineConsumerWithClose() {
        Builder builder = new WordWrap.Builder();
        when(from(Readers.reader(new InputStreamReader(System.in), StandardCharsets.UTF_8), true)).thenReturn(builder);
        String result = builder.wordWrap(Readers.reader(new InputStreamReader(System.in), StandardCharsets.UTF_8),
                (line) -> line.trim());
        assertEquals("hello world", result.toString());
    }

}