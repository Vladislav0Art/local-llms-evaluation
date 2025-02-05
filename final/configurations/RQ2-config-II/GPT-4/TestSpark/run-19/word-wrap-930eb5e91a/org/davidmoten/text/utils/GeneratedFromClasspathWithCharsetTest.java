package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

public class GeneratedFromClasspathWithCharsetTest {

    @Test
    public void fromClasspathWithCharsetTest() {
        Assert.assertNotNull(WordWrap.fromClasspath("testResource", StandardCharsets.UTF_8));
    }

}