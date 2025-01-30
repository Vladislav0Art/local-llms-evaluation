package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedFromUtf8Test {

    @Test
    public void fromUtf8Test() {
        InputStream mockInputStream = mock(InputStream.class);
        WordWrap.Builder builder = WordWrap.fromUtf8(mockInputStream);
        Assert.assertNotNull(builder);
    }

}