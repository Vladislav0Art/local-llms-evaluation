package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.*;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedWordWrapTest {

    @Test
    public void wordWrapTest() throws IOException {
        final AtomicInteger lines = new AtomicInteger(0);
        WordWrap.wrap(new StringReader("hello world"), new StringWriter(),
                "\n", 5, s -> s.length(), Collections.emptySet(), true, true,
                (output, throwable) -> lines.incrementAndGet());
        assertEquals(2, lines.get());
    }

}