package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

public class GeneratedFromReaderCloseTest {

    @Test
    public void fromReaderCloseTest() {
        Reader reader = mock(Reader.class);
        WordWrap.Builder builder = WordWrap.from(reader, true);
        assertNotNull(builder);
    }

}