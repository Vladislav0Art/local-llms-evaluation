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

public class GeneratedWordWrapLineConsumerIOException {

    @Test
    public void wordWrapLineConsumerIOException() throws IOException {
        Reader reader = Mockito.mock(Reader.class);
        WordWrap.LineConsumer consumer = Mockito.mock(WordWrap.LineConsumer.class);
        WordWrap.wordWrap(reader, consumer, 5, Formatter::countWidth, new HashSet<>(), false, false);
    }

}