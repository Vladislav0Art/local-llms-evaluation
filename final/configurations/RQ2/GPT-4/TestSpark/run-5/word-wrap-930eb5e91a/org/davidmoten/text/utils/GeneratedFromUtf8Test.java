package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class GeneratedFromUtf8Test {

    @Test
    public void fromUtf8Test() {
        byte[] data = "Hello, World!".getBytes(java.nio.charset.StandardCharsets.UTF_8);
        InputStream in = new ByteArrayInputStream(data);
        Assert.assertNotNull(WordWrap.fromUtf8(in));
    }

}