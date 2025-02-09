package org.davidmoten.text.utils;

import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.Assert;
import com.github.davidmoten.guavamini.annotations.VisibleForTesting;

import java.nio.charset.Charset;
import java.io.*;

public class GeneratedFromSequenceTest {

    @Test
    public void fromSequenceTest() {
        WordWrap.Builder result = WordWrap.from("Test sequence");
        Assert.assertNotNull(result);
    }

}