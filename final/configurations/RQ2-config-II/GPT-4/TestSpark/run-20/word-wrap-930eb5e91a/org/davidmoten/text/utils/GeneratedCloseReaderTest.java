package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedCloseReaderTest {

    @Test
    public void closeReaderTest() {
        final Reader reader = new StringReader("");
        WordWrap.close(reader);
        assertTrue(true); // If it doesn't throw an exception, the test passes.
    }

}