package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

public class GeneratedValidateFile_InvalidVersionTest {

    @Test
    public void validateFile_InvalidVersionTest() throws IOException, GalimatiasParseException {
        File file = new File("valid.epub");
        EpubChecker instance = new EpubChecker();
        try {
            instance.validateFile(file.getAbsolutePath(), "invalid-version", new CheckingReport(), new EPUBProfile());
            fail("Expected InvalidVersionException to be thrown.");
        } catch (InvalidVersionException e) {
            assertEquals("Invalid version", e.getMessage());
        }
    }

}