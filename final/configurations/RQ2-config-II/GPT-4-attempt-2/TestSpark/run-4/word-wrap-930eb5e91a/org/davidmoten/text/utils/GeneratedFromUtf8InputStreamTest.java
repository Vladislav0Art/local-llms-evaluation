package org.davidmoten.text.utils;

import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.Assert;
import com.github.davidmoten.guavamini.annotations.VisibleForTesting;

import java.nio.charset.Charset;
import java.io.*;

public class GeneratedFromUtf8InputStreamTest {

    @Test
    public void fromUtf8InputStreamTest() throws FileNotFoundException {
        InputStream in = new FileInputStream("resource.txt");
        WordWrap.Builder result = WordWrap.fromUtf8(in);
        Assert.assertNotNull(result);
    }

}