package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

public class GeneratedValidateFile_invalidArgs_test {

    @Test
    public void validateFile_invalidArgs_test() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new outWriter(outContent));
        String path = "path/to/epub/file.epub";
        int result = new EpubChecker().validateFile(path, null, new Report(), new EPUBProfile());
        assertTrue(result >= 0);
    }

}