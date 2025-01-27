package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;

import static org.junit.Assert.*;
import static com.github.davidmoten.guavamini.Preconditions.checkArgument;

public class GeneratedWordWrapReaderLineConsumerTest {

    @Test
    public void wordWrapReaderLineConsumerTest() throws IOException {
        String text = "Hello World";
        WordWrap.Builder builder = WordWrap.fromUtf8(new ByteArrayInputStream(text.getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        writer(out::writeBytes, 80);
        WordWrap.wordWrap(builder.reader(), out, "\n", 80, (s) -> s.length(), new HashSet<>(), false, true);
        assertTrue(out.toString().contains("Hello\nWorld"));
    }

}