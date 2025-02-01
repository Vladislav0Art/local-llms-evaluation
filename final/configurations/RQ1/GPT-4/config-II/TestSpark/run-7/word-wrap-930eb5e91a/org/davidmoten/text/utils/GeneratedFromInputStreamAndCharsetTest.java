package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class GeneratedFromInputStreamAndCharsetTest {

    @Test
    public void fromInputStreamAndCharsetTest() {
        InputStream in = new ByteArrayInputStream("Test InputStream".getBytes());
        assertNotNull(WordWrap.from(in, java.nio.charset.StandardCharsets.UTF_8));
    }

}