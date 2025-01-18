package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.davidmoten.text.utils.WordWrap;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedFromUtf8Test {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void fromUtf8Test() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("src/test/resources/test-resource.txt");
        WordWrap.Builder builder = WordWrap.fromUtf8(fileInputStream);
        assertNotNull(builder);
    }

}