package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.function.Function;

import static org.junit.Assert.assertEquals;

public class GeneratedFromReaderCloseTest {

    @Test
    public void fromReaderCloseTest() {
        StringReader stringReader = new StringReader("Test string");
        WordWrap.Builder builder = WordWrap.from(stringReader, true);

        assertEquals(WordWrap.Builder.class, builder.getClass());
    }

}