package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.function.Function;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedWordWrapReaderLineConsumer {

    @Mock
    private Reader reader;

    @Mock
    private Writer writer;

    @Mock
    private LineConsumer lineConsumer;

    @Mock
    private String resource;

    @Mock
    private String text;

    @Mock
    private InputStream in;

    @Test
    public void wordWrapReaderLineConsumer() throws IOException {
        WordWrap.wordWrap(reader, lineConsumer, 10, c -> 10, Set.of(' '), false, true);
        // Test implementation not available without mocking.
    }

}