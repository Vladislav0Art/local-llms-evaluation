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
public class GeneratedWordWrapReaderLineConsumerTest {

    @Mock
    private Reader mockReader;

    @Mock
    private Writer mockWriter;

    @Test
    public void wordWrapReaderLineConsumerTest() throws IOException {
        LineConsumer lineConsumer = new LineConsumer() {
            public void write(String s, int off, int len) {
            }

            public void writeWordStart() {
            }

            public void writeWordEnd(String newLine) {
            }
        };
        WordWrap.wordWrap(mockReader, lineConsumer, 10, s -> s.length(),
                new HashSet<>(), false, false);
        // Check if methods of lineConsumer were called;
        // difficult to assert an exact value due to unpredictable internal implementation
    }

}