package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

import static org.junit.Assert.*;

public class GeneratedWordWrapIOExceptionTest {

    @Test
    public void wordWrapIOExceptionTest() throws IOException {
        Reader reader = Mockito.mock(Reader.class);
        Writer writer = Mockito.mock(Writer.class);
        Function function = Mockito.mock(Function.class);
        Set<Character> set = new HashSet<>();
        Mockito.when(reader.read()).thenThrow(new IOException());

        WordWrap.wordWrap(reader, writer, "\n", 80, function, set, true, true);
    }

}