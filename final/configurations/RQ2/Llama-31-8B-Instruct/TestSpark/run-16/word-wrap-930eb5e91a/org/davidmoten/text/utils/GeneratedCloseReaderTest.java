package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedCloseReaderTest {

    @Test
    public void closeReaderTest() {
        Reader reader = mock(Reader.class);
        WordWrap.close(reader);
        verify(reader).close();
    }

}