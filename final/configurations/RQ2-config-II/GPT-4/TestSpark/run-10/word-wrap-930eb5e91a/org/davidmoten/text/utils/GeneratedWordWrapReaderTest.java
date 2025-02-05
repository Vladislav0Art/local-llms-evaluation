package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.function.Function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedWordWrapReaderTest {

    @Test
    public void wordWrapReaderTest() throws IOException {
        Reader reader = new StringReader("This is a test");
        Writer writer = new StringWriter();
        Function<CharSequence, Integer> fun = s -> s.length();
        WordWrap.wordWrap(reader, writer, "\n", 10, fun, Collections.emptySet(), false, true);
        assertEquals("This\nis a\ntest\n", writer.toString());
    }

}