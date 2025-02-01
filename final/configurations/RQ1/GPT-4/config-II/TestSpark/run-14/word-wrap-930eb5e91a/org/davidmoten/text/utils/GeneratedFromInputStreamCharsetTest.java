package org.davidmoten.text.utils;

import com.github.davidmoten.guavamini.annotations.VisibleForTesting;
import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

public class GeneratedFromInputStreamCharsetTest {

    @Test
    public void fromInputStreamCharsetTest() throws IOException {
        InputStream in = mock(InputStream.class);
        assertEquals(WordWrap.Builder.class, WordWrap.from(in, StandardCharsets.UTF_8).getClass());
    }

}