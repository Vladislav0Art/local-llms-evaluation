package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.davidmoten.text.utils.WordWrap;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedFromFileWithCharsetTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void fromFileWithCharsetTest() throws IOException {
        File file = tempFolder.newFile("testFile.txt");
        WordWrap.Builder builder = WordWrap.from(file, StandardCharsets.UTF_8);
        assertNotNull(builder);
    }

}