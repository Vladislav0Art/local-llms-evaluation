package org.davidmoten.text.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.*;

public class GeneratedWrapFileCharsetTest {

    @Test
    public void wrapFileCharsetTest() throws IOException {
        File tempFile = File.createTempFile("prefix", "suffix");
        tempFile.deleteOnExit();

        WordWrap.Builder builder = WordWrap.from(new StringReader("test"));
        builder.wrap(tempFile, null);


        assertTrue(tempFile.exists());
    }

}