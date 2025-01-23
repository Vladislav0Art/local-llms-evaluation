package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedFromInputStreamWithCharsetTest {

    @Test
    public void fromInputStreamWithCharsetTest() {
        java.io.InputStream in = mock(java.io.InputStream.class);
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
        org.davidmoten.text.utils.WordWrap.Builder builder = org.davidmoten.text.utils.WordWrap.from(in, charset);
        assertNotNull(builder);
    }

}