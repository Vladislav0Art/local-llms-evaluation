package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() {
        java.io.Reader reader = mock(java.io.Reader.class);
        org.davidmoten.text.utils.WordWrap.Builder builder = org.davidmoten.text.utils.WordWrap.from(reader);
        assertNotNull(builder);
    }

}