package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class GeneratedCloseIOExceptionTest {

    @Test
    public void closeIOExceptionTest() throws IOException {
        Reader reader = Mockito.mock(Reader.class);
        Mockito.doThrow(new IOException()).when(reader).close();
        WordWrap.close(reader);
    }

}