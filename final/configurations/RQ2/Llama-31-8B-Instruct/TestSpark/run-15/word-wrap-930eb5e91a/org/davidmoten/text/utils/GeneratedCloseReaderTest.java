package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class GeneratedCloseReaderTest {

    @Test
    public void closeReaderTest() {
        Reader reader = mock(Reader.class);
        WordWrap.close(reader);
        verify(reader).close();
    }

}