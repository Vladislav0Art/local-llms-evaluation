package org.davidmoten.text.utils;

import org.junit.Test;
import org.davidmoten.text.utils.WordWrap;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GeneratedCloseReaderTest {

    @Test
    public void closeReaderTest() {
        WordWrap.close(new StringReader("Test"));
    }

}