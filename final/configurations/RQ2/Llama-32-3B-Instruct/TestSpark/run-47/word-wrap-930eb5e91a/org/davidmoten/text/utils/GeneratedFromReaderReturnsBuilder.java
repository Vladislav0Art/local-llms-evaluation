package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedFromReaderReturnsBuilder {

    @Test
    public void fromReaderReturnsBuilder() {
        Reader reader = Mockito.mock(Reader.class);
        when(reader.read()).thenReturn(-1);
        assertEquals(WordWrap.Builder.class, WordWrap.from(reader).getClass());
    }

}