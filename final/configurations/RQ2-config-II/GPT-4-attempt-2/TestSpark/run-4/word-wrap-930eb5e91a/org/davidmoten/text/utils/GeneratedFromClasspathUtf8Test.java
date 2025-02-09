package org.davidmoten.text.utils;

import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.Assert;
import com.github.davidmoten.guavamini.annotations.VisibleForTesting;

import java.nio.charset.Charset;
import java.io.*;

public class GeneratedFromClasspathUtf8Test {

    @Test
    public void fromClasspathUtf8Test() {
        String resource = "/resource.txt";
        WordWrap.Builder result = WordWrap.fromClasspathUtf8(resource);
        Assert.assertNotNull(result);
    }

}