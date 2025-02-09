package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.function.Function;
import java.util.HashSet;
import java.util.Set;

public class GeneratedFromInputStreamCharsetTest {

    @Test
    public void fromInputStreamCharsetTest() {
        InputStream inputStream = new ByteArrayInputStream("test".getBytes());
        Assert.assertNotNull(WordWrap.from(inputStream, StandardCharsets.UTF_8));
    }

}