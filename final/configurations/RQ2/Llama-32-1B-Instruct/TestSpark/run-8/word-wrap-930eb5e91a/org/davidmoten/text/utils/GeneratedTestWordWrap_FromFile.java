package org.davidmoten.text.utils;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestWordWrap_FromFile {

    @Test
    public void testWordWrap_FromFile() {
        Builder builder = new WordWrap.Builder();
        when(fromFile("resource.txt")).thenReturn(builder);
        File file = new File("resource.txt");
        try (InputStream in = new FileInputStream(file)) {
            String result = builder.wordWrap(in, null, null, null, null, true, false);
            assertEquals("hello world", result.toString());
        }
    }

}