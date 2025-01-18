package org.davidmoten.text.utils;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.util.function.Function;

import static org.junit.Assert.*;

public class GeneratedWordWrapReaderTest {

    @Test
    public void wordWrapReaderTest() throws IOException {
        BufferedReader in = new BufferedReader(new StringReader("test"));
        StringWriter out = new StringWriter();

        Function<CharSequence, Number> defaultCharWidthProvider = (text -> text.length());

        WordWrap.wordWrap(in, out, "\n", 80, defaultCharWidthProvider, null, false, false);
    }

}