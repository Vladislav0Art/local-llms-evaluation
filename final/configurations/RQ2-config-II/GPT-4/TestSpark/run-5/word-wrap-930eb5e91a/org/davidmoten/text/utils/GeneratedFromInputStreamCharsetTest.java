package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashSet;

public class GeneratedFromInputStreamCharsetTest {

    @Test
    public void fromInputStreamCharsetTest() throws IOException {
        Charset charset = Charset.forName("UTF-8");
        String text = "Hello World";
        InputStream inputStream = new ByteArrayInputStream(text.getBytes(charset));
        WordWrap.Builder builder = WordWrap.from(inputStream, charset);
        Assert.assertNotNull(builder);
        inputStream.close();
    }

}