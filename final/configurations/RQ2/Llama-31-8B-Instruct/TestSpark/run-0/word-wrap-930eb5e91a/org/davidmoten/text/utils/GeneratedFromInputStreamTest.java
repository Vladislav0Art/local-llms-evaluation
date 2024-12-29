package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedFromInputStreamTest {

    @Test
    public void fromInputStreamTest() throws Exception {
        java.io.InputStream in = mock(java.io.InputStream.class);
        org.davidmoten.text.utils.WordWrap.Builder builder = org.davidmoten.text.utils.WordWrap.fromUtf8(in);
        assertNotNull(builder);
    }

}