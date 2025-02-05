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

public class GeneratedWordWrapToWriterTest {

    @Test
    public void wordWrapToWriterTest() throws IOException {
        StringWriter writer = new StringWriter();
        WordWrap.wordWrap(new StringReader("Test"), writer, "\n", 80, str -> 80, new HashSet<>(), false, false);
        Assert.assertEquals("Test", writer.toString().trim());
    }

}