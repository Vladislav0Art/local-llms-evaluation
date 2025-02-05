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

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() {
        Reader reader = new StringReader("Test");
        WordWrap.Builder builder = WordWrap.from(reader);
        Assert.assertNotNull(builder);
    }

}