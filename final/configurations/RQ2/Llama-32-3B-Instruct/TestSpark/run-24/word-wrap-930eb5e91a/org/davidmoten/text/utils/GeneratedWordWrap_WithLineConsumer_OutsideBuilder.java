package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedWordWrap_WithLineConsumer_OutsideBuilder {

    @Mock
    private Reader reader;

    @Mock
    private Writer writer;

    @Mock
    private LineConsumer lineConsumer;

    @Test
    public void wordWrap_WithLineConsumer_OutsideBuilder() throws IOException {
        // Given
        when(lineConsumer.consume(any())).thenReturn(0);
        WordWrap.Builder builder = new WordWrap.Builder();

        // When
        WordWrap.wordWrap(reader, lineConsumer, 10, (s) -> 5L, new HashSet<>(), false, true);

        // Then
        assertTrue(lineConsumer.consume().length() > 0);
    }

}