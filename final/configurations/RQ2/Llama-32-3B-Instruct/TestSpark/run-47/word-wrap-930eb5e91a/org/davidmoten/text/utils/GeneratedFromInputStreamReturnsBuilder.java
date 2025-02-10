package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedFromInputStreamReturnsBuilder {

    @Test
    public void fromInputStreamReturnsBuilder() {
        InputStream in = Mockito.mock(InputStream.class);
        Charset charset = StandardCharsets.UTF_8;
        assertEquals(WordWrap.Builder.class, WordWrap.from(in, charset).getClass());
    }

}