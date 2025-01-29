package org.davidmoten.text.utils;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestWordWrap_FromReaderLineConsumer {

    @Test
    public void testWordWrap_FromReaderLineConsumer() {
        Builder builder = new WordWrap.Builder();
        when(from(Readers.reader(new InputStreamReader(System.in), "hello world")).thenReturn(builder));
        String result = builder.wordWrap("hello world");
        assertEquals("hello-world", result.toString());
    }

}