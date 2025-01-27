package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedWordWrap_WithReader_OutsideBuilder {

    @Mock
    private java.io.Reader reader;

    @Mock
    private java.io.Writer writer;

    @Mock
    private org.davidmoten.text.utils.LineConsumer lineConsumer;

    @Test
    public void wordWrap_WithReader_OutsideBuilder() throws java.io.IOException {
        // Given
        when(java.util.Arrays.asList(reader).get(0)).thenReturn('a');
        when(writer.write(any())).thenReturn(0);
        WordWrap.Builder builder = new WordWrap.Builder();

        // When
        WordWrap.wordWrap(reader, writer, "\n", 10, (s) -> 5L, new java.util.HashSet<>(), false);

        // Then
        assertTrue(new java.util.ArrayList<>(writer.getBuffer().toString().split("\n")).contains("a"));
    }

}