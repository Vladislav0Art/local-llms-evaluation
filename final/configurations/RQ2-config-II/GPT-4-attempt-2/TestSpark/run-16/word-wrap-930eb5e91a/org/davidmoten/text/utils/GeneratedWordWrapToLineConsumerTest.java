package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedWordWrapToLineConsumerTest {

    @Test
    public void wordWrapToLineConsumerTest() throws IOException {
        LineConsumer out = new LineConsumer() {
            @Override
            public void accept(String line) {
            }

            @Override
            public void close() {
            }
        };
        WordWrap.wordWrap(new StringReader("some text"), out, 80, String::length, null, true, false);
    }

}