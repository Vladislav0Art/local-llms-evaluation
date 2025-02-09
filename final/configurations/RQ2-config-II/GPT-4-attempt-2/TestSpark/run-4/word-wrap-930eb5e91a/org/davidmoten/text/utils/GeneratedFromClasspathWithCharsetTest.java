package org.davidmoten.text.utils;

import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.Assert;
import com.github.davidmoten.guavamini.annotations.VisibleForTesting;

import java.nio.charset.Charset;
import java.io.*;

public class GeneratedFromClasspathWithCharsetTest {

    @Test
    public void fromClasspathWithCharsetTest() {
        String resource = "/resource.txt";
        WordWrap.Builder result = WordWrap.fromClasspath(resource, Charset.defaultCharset());
        Assert.assertNotNull(result);
    }

}