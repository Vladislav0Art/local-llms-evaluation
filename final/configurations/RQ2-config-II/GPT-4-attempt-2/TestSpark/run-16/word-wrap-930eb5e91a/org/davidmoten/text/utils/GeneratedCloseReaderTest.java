package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedCloseReaderTest {

    @Test
    public void closeReaderTest() {
        StringReader reader = new StringReader("");
        WordWrap.close(reader);
        assertFalse(reader.ready());
    }

}