package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedFromInputStreamTest {

    @Test
    public void fromInputStreamTest() {
        final WordWrap.Builder builder = WordWrap.from(System.in, StandardCharsets.UTF_8);
        assertNotNull(builder);
    }

}