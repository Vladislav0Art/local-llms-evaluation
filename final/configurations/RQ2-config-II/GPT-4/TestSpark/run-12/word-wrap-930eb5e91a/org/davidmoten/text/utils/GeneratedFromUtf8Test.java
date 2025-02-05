package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.BufferedReader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashSet;
import java.util.Set;

import static org.mockito.Mockito.*;

public class GeneratedFromUtf8Test {

    @Test
    public void fromUtf8Test() {
        InputStream stream = new ByteArrayInputStream("Test".getBytes(StandardCharsets.UTF_8));
        WordWrap.Builder builder = WordWrap.fromUtf8(stream);
        Assert.assertNotNull(builder);
    }

}