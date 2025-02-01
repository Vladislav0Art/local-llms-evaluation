package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.Writer;

import static org.junit.Assert.*;

public class GeneratedFromInputStreamCharsetTest {

    @Test
    public void fromInputStreamCharsetTest() {
        InputStream in = new ByteArrayInputStream("test".getBytes());
        Charset charset = StandardCharsets.UTF_8;
        WordWrap.Builder result = WordWrap.from(in, charset);
        assertNotNull(result);
    }

}