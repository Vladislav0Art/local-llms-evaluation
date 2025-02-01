package org.davidmoten.text.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.Arrays;

import org.davidmoten.text.utils.WordWrap;

public class GeneratedFromInputStreamTest {

    @Test
    public void fromInputStreamTest() {
        ByteArrayInputStream inputStream = new ByteArrayInputStream("Test Text".getBytes());
        assertNotNull(WordWrap.from(inputStream, StandardCharsets.UTF_8));
    }

}