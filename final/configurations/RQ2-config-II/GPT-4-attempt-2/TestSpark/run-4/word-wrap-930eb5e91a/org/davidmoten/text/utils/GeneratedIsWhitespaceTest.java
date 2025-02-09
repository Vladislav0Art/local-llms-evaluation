package org.davidmoten.text.utils;

import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.Assert;
import com.github.davidmoten.guavamini.annotations.VisibleForTesting;

import java.nio.charset.Charset;
import java.io.*;

public class GeneratedIsWhitespaceTest {

    @Test
    public void isWhitespaceTest() {
        boolean result = WordWrap.isWhitespace("    ");
        Assert.assertTrue(result);
        result = WordWrap.isWhitespace("notWhitespace");
        Assert.assertFalse(result);
    }

}