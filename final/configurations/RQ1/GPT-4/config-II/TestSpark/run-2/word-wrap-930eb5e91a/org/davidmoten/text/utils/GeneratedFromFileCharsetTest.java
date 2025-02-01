package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GeneratedFromFileCharsetTest {

    @Test
    public void fromFileCharsetTest() throws IOException {
        File tempFile = File.createTempFile("testFile", ".txt");
        Builder builder = WordWrap.from(tempFile, StandardCharsets.UTF_8);
        Assert.assertNotNull(builder);
    }

}