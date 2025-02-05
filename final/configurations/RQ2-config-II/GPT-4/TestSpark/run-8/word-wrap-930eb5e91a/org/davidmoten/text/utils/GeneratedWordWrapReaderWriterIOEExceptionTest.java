package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class GeneratedWordWrapReaderWriterIOEExceptionTest {

    @Test
    public void wordWrapReaderWriterIOEExceptionTest() throws IOException {
        String input = "Hello World this is a long string which will exceed max width";
        StringReader stringReader = new StringReader(input);
        StringWriter stringWriter = new StringWriter();

        WordWrap.wordWrap(stringReader, stringWriter, "\n", 10, CharSequence::length, new HashSet<>(), false, true);
    }

}