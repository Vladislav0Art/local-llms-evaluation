package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashSet;

public class GeneratedFromUtf8Test {

    @Test
    public void fromUtf8Test() throws IOException {
        String text = "Hello World";
        InputStream in = new ByteArrayInputStream(text.getBytes());
        WordWrap.Builder builder = WordWrap.fromUtf8(in);
        Assert.assertNotNull(builder);
        in.close();
    }

}