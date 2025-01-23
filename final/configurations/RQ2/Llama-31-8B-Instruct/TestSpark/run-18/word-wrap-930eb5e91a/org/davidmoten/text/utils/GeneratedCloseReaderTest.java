package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedCloseReaderTest {

    @Test
    public void closeReaderTest() {
        java.io.Reader reader = mock(java.io.Reader.class);
        try {
            WordWrap.close(reader);
        } catch (java.io.IOException e) {
            fail("IOException was expected");
        }
    }

}