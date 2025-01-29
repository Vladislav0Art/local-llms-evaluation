package org.davidmoten.text.utils;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestWordWrap_FromUtf8InputStream {

    @Test
    public void testWordWrap_FromUtf8InputStream() {
        Builder builder = new WordWrap.Builder();
        when(fromUtf8(Readers.reader(new FileInputStream("resource.txt")))).thenReturn(builder);
        String result = builder.wordWrap(Readers.reader(new FileInputStream("resource.txt")));
        assertEquals("hello world", result.toString());
    }

}