package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedFromUtf8InputStreamReturnsBuilder {

    @Test
    public void fromUtf8InputStreamReturnsBuilder() {
        InputStream in = Mockito.mock(InputStream.class);
        when(in.read()).thenReturn(-1);
        assertEquals(WordWrap.Builder.class, WordWrap.fromUtf8(in).getClass());
    }

}