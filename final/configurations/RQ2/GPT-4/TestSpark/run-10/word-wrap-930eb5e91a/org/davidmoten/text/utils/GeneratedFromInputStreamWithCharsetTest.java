package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.davidmoten.text.utils.WordWrap;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedFromInputStreamWithCharsetTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void fromInputStreamWithCharsetTest() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("src/test/resources/test-resource.txt");
        WordWrap.Builder builder = WordWrap.from(fileInputStream, StandardCharsets.UTF_8);
        assertNotNull(builder);
    }

}