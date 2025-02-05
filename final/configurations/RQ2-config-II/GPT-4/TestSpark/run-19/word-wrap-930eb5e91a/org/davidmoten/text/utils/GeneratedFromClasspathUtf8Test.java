package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

public class GeneratedFromClasspathUtf8Test {

    @Test
    public void fromClasspathUtf8Test() {
        Assert.assertNotNull(WordWrap.fromClasspathUtf8("testResource"));
    }

}