package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.davidmoten.text.utils.WordWrap;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedFromReaderTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void fromReaderTest() throws IOException {
        File file = tempFolder.newFile("testFile.txt");
        PrintWriter out = new PrintWriter(file);
        out.println("Testing Reader Input");
        out.close();

        Reader reader = new FileReader(file);
        WordWrap.Builder builder = WordWrap.from(reader);
        assertNotNull(builder);
    }

}