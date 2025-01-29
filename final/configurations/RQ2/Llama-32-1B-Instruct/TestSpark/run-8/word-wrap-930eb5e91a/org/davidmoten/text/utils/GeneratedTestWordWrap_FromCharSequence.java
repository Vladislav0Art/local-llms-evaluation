package org.davidmoten.text.utils;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestWordWrap_FromCharSequence {

    @Test
    public void testWordWrap_FromCharSequence() {
        Builder builder = new WordWrap.Builder();
        when(from(CharSequence.class, CharSequence.class)).thenReturn(builder);
        String result = builder.wordWrap(CharSequence.text);
        assertEquals(CharSequence.text, result.toString());
    }

}