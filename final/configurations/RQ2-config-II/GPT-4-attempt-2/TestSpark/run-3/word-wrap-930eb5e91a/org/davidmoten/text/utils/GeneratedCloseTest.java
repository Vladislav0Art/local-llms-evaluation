package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.function.Function;
import java.util.HashSet;
import java.util.Set;

public class GeneratedCloseTest {

    @Test
    public void closeTest() throws Exception {
        Reader reader = Mockito.mock(Reader.class);
        WordWrap.close(reader);
        Mockito.verify(reader).close();
    }

}