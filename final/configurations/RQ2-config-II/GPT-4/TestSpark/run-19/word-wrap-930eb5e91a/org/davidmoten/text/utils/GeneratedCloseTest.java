package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

public class GeneratedCloseTest {

    @Test
    public void closeTest() {
        Reader reader = Mockito.mock(Reader.class);
        Mockito.doThrow(new UnsupportedOperationException()).when(reader).close();
        WordWrap.close(reader);
    }

}