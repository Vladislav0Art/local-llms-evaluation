package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class GeneratedFromInputStreamCharsetTest {

    @Test
    public void fromInputStreamCharsetTest() {
        byte[] data = "Hello, World!".getBytes(java.nio.charset.StandardCharsets.UTF_8);
        InputStream in = new ByteArrayInputStream(data);
        Assert.assertNotNull(WordWrap.from(in, java.nio.charset.StandardCharsets.UTF_8));
    }

}