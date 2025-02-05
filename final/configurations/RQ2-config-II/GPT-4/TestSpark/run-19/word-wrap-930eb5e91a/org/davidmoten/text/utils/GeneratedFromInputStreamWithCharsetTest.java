package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

public class GeneratedFromInputStreamWithCharsetTest {

    @Test
    public void fromInputStreamWithCharsetTest() {
        InputStream in = new ByteArrayInputStream("Hello World".getBytes());
        Assert.assertNotNull(WordWrap.from(in, StandardCharsets.UTF_8));
    }

}