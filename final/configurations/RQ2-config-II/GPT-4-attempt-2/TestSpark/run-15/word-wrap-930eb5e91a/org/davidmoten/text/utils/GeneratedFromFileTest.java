package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class GeneratedFromFileTest {

    @Test
    public void fromFileTest() throws IOException {
        File tempFile = File.createTempFile("testFile", ".txt");
        WordWrap.Builder builder = WordWrap.from(tempFile, StandardCharsets.UTF_8);
        assertEquals(builder.reader.getClass(), BufferedReader.class);
        tempFile.delete();
    }

}