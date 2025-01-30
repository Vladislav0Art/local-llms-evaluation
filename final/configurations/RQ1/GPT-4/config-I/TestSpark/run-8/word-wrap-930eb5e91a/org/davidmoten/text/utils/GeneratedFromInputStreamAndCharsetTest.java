package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedFromInputStreamAndCharsetTest {

    @Test
    public void fromInputStreamAndCharsetTest() {
        InputStream inputStream = mock(InputStream.class);
        WordWrap.Builder builder = WordWrap.from(inputStream, StandardCharsets.UTF_8);
        Assert.assertNotNull(builder);
    }

}