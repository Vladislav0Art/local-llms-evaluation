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

public class GeneratedFromUtf8InputStreamTest {

    @Test
    public void fromUtf8InputStreamTest() {
        InputStream inputStream = new ByteArrayInputStream("test".getBytes());
        Assert.assertNotNull(WordWrap.fromUtf8(inputStream));
    }

}