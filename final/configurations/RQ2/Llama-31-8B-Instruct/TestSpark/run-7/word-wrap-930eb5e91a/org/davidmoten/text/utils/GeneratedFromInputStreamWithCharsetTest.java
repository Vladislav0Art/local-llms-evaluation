package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

public class GeneratedFromInputStreamWithCharsetTest {

    @Test
    public void fromInputStreamWithCharsetTest() {
        java.io.InputStream in = mock(InputStream.class);
        java.nio.charset.Charset charset = StandardCharsets.UTF_8;
        WordWrap.Builder builder = WordWrap.from(in, charset);
        assertNotNull(builder);
    }

}