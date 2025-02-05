package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.Assert;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

public class GeneratedFromWithCloseTest {

    @Test
    public void fromWithCloseTest() {
        testReaderClose(true);
        testReaderClose(false);
    }

    private void testReaderClose(boolean close) {
        WordWrap.Builder result = WordWrap.from(new StringReader("Test"), close);
        Assert.assertNotNull(result);
    }

}