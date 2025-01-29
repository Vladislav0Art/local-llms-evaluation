package org.davidmoten.text.utils;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestWordWrap_FromReaderLineConsumerWithBreakWordsAndInsertHyphensAndClose {

    @Test
    public void testWordWrap_FromReaderLineConsumerWithBreakWordsAndInsertHyphensAndClose() {
        Builder builder = new WordWrap.Builder();
        when(from(Readers.reader(new InputStreamReader(System.in), "hello world\n")).thenReturn(builder));
        String result = builder.wordWrap("hello-world\n");
        assertEquals("hello-world", result.toString());
    }

}