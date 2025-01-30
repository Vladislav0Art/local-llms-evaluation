package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class GeneratedFromFileCharsetTest {

    @Test
    public void fromFileCharsetTest() throws IOException {
        File tempFile = File.createTempFile("tempFile", ".txt");
        tempFile.deleteOnExit();
        try (BufferedWriter out = new BufferedWriter(new FileWriter(tempFile))) {
            out.write("Test");
        }
        Builder builder = WordWrap.from(tempFile, StandardCharsets.UTF_8);
        Assert.assertNotNull(builder);
    }

}