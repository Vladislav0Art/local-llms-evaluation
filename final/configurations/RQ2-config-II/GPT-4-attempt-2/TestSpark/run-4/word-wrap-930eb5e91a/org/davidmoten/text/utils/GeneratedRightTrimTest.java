package org.davidmoten.text.utils;

import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.Assert;
import com.github.davidmoten.guavamini.annotations.VisibleForTesting;

import java.nio.charset.Charset;
import java.io.*;

public class GeneratedRightTrimTest {

    @Test
    public void rightTrimTest() {
        CharSequence res = WordWrap.rightTrim("Test sequence ");
        Assert.assertEquals("Test sequence", res.toString());
    }

}