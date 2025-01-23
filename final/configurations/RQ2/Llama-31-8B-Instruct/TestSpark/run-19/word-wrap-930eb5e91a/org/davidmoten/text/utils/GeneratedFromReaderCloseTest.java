package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedFromReaderCloseTest {

    @Test
    public void fromReaderCloseTest() {
        java.io.Reader reader = mock(java.io.Reader.class);
        WordWrap.Builder builder = WordWrap.from(reader, true);
        assertNotNull(builder);
    }

}