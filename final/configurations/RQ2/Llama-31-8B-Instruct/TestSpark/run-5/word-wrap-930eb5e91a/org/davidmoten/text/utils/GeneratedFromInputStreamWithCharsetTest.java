package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedFromInputStreamWithCharsetTest {

    @Test
    public void fromInputStreamWithCharsetTest() throws Exception {
        InputStream in = mock(InputStream.class);
        Charset charset = java.nio.charset.StandardCharsets.UTF_8;
        WordWrap.Builder builder = WordWrap.from(in, charset);
        assertNotNull(builder);
    }

}