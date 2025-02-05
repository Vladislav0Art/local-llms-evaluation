package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashSet;

public class GeneratedFromReaderWithCloseTrueTest {

    @Test
    public void fromReaderWithCloseTrueTest() {
        StringReader reader = new StringReader("Hello World");
        WordWrap.Builder builder = WordWrap.from(reader, true);
        Assert.assertNotNull(builder);
    }

}