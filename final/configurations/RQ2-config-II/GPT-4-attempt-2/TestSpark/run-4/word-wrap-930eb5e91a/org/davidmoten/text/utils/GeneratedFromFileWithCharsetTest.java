package org.davidmoten.text.utils;

import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.Assert;
import com.github.davidmoten.guavamini.annotations.VisibleForTesting;

import java.nio.charset.Charset;
import java.io.*;

public class GeneratedFromFileWithCharsetTest {

    @Test
    public void fromFileWithCharsetTest() {
        File file = new File("resource.txt");
        WordWrap.Builder result = WordWrap.from(file, Charset.defaultCharset());
        Assert.assertNotNull(result);
    }

}