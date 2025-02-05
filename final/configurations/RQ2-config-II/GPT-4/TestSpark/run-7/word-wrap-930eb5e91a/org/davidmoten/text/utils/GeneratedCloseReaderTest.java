package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.function.Function;

import static org.junit.Assert.assertEquals;

public class GeneratedCloseReaderTest {

    @Test
    public void closeReaderTest() {
        StringReader stringReader = new StringReader("Test string");
        WordWrap.close(stringReader);

        assertEquals(WordWrap.Builder.class, builder.getClass());
    }

}