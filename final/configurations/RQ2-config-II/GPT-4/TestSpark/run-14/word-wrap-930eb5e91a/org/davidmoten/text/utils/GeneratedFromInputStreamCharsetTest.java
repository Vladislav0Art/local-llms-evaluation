package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.*;

public class GeneratedFromInputStreamCharsetTest {

    @Test
    public void fromInputStreamCharsetTest() {
        InputStream inputStream = new ByteArrayInputStream("Testing from method.".getBytes());
        WordWrap.Builder builder = WordWrap.from(inputStream, Charset.defaultCharset());
        assertNotNull(builder);
    }

}