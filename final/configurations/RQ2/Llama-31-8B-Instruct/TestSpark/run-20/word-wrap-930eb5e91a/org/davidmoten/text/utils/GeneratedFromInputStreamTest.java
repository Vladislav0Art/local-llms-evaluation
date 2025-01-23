package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class GeneratedFromInputStreamTest {

    @Test
    public void fromInputStreamTest() {
        InputStream in = mock(InputStream.class);
        WordWrap.Builder builder = WordWrap.fromUtf8(in);
        assertNotNull(builder);
    }

}