package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.function.Function;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedWordWrapReaderWriterTest {

    @Mock
    private Reader mockReader;

    @Mock
    private Writer mockWriter;

    @Test
    public void wordWrapReaderWriterTest() throws IOException {
        WordWrap.wordWrap(mockReader, mockWriter, "\n", 10, s -> s.length(),
                new HashSet<>(), false, false);
        Mockito.verify(mockWriter, Mockito.atLeastOnce()).write(Mockito.anyString(), Mockito.anyInt(), Mockito.anyInt());
    }

}