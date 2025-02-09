package org.davidmoten.text.utils;

import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.Assert;
import com.github.davidmoten.guavamini.annotations.VisibleForTesting;

import java.nio.charset.Charset;
import java.io.*;

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() {
        Reader reader = mock(Reader.class);
        WordWrap.Builder result = WordWrap.from(reader);
        Assert.assertNotNull(result);
    }

}