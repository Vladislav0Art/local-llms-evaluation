package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

public class GeneratedFromUtf8Test {

    @Test
    public void fromUtf8Test() {
        InputStream in = new ByteArrayInputStream("Hello World".getBytes());
        Assert.assertNotNull(WordWrap.fromUtf8(in));
    }

}