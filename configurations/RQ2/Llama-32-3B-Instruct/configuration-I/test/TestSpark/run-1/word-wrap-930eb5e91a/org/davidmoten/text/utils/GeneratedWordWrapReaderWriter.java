package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.function.Function;

import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.PrintWriter;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedWordWrapReaderWriter {

    @Mock
    private org.davidmoten.text.utils.Reader reader;

    @Mock
    private org.davidmoten.text.utils.Writer writer;

    @Mock
    private org.davidmoten.text.utils.LineConsumer lineConsumer;

    @Mock
    private String resource;

    @Mock
    private CharSequence text;

    @Mock
    private InputStream in;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void wordWrapReaderWriter() throws IOException {
        WordWrap.wordWrap(reader, writer, "\n", 10, c -> 10, Set.of(' '), false, true);
        // Test implementation not available without mocking.
    }

}