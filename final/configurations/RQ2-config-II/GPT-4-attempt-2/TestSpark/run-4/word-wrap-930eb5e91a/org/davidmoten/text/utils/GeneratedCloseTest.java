package org.davidmoten.text.utils;

import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.Assert;
import com.github.davidmoten.guavamini.annotations.VisibleForTesting;

import java.nio.charset.Charset;
import java.io.*;

public class GeneratedCloseTest {

    @Test
    public void closeTest() throws IOException {
        Reader reader = mock(Reader.class);
        doThrow(new IOException()).when(reader).close();
        WordWrap.close(reader);
    }

}