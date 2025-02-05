package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.function.Function;

import static org.junit.Assert.assertEquals;

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() {
        StringReader stringReader = new StringReader("Test string");
        WordWrap.Builder builder = WordWrap.from(stringReader);

        assertEquals(WordWrap.Builder.class, builder.getClass());
    }

}