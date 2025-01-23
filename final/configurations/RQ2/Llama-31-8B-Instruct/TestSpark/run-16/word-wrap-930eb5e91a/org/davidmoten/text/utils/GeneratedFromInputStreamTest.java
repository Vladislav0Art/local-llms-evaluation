package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedFromInputStreamTest {

    @Test
    public void fromInputStreamTest() throws java.io.IOException {
        java.io.InputStream in = mock(java.io.InputStream.class);
        WordWrap.Builder builder = WordWrap.fromUtf8(in);
        assertNotNull(builder);
    }

}