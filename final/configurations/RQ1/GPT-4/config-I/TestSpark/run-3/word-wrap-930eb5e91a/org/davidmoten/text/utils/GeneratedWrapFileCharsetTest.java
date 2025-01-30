package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class GeneratedWrapFileCharsetTest {

    @Test
    public void wrapFileCharsetTest() throws IOException {
        File tempFile = File.createTempFile("tempFile", ".txt");
        tempFile.deleteOnExit();
        Reader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream("Test".getBytes())));
        WordWrap.from(reader).wrap(tempFile, StandardCharsets.UTF_8);
    }

}