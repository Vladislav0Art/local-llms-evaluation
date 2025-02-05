package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashSet;

public class GeneratedFromReaderWithCloseFalseTest {

    @Test
    public void fromReaderWithCloseFalseTest() {
        StringReader reader = new StringReader("Hello World");
        WordWrap.Builder builder = WordWrap.from(reader, false);
        Assert.assertNotNull(builder);
    }

}