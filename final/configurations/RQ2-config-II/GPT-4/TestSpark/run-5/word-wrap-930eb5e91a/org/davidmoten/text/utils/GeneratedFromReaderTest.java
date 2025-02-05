package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashSet;

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() throws IOException {
        StringReader reader = new StringReader("Hello World");
        WordWrap.Builder builder = WordWrap.from(reader);
        Assert.assertNotNull(builder);
        reader.close();
    }

}