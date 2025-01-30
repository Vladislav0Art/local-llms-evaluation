package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class GeneratedFromInputStreamCharsetTest {

    @Test
    public void fromInputStreamCharsetTest() {
        InputStream in = new ByteArrayInputStream("Test".getBytes());
        Builder builder = WordWrap.from(in, StandardCharsets.UTF_8);
        Assert.assertNotNull(builder);
    }

}