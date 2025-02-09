package org.davidmoten.text.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

import org.junit.Test;

public class GeneratedWordWrapLineConsumerTest {

    @Test
    public void wordWrapLineConsumerTest() throws IOException {
        StringReader reader = new StringReader("hello world");
        StringWriter writer = new StringWriter();
        LineConsumer consumer = new WriterLineConsumer(new PrintWriter(writer));
        WordWrap.wordWrap(reader, consumer, 80, s -> s.length(), new HashSet<>(), true, true);
        assertEquals("hello world", writer.toString());
    }

}