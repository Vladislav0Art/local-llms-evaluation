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

public class GeneratedFromFileWithCharsetTest {

    @Test
    public void fromFileWithCharsetTest() {
        WordWrap.Builder builder = WordWrap.from(new File("resource"), StandardCharsets.UTF_8);
        Assert.assertNotNull(builder);
    }

}