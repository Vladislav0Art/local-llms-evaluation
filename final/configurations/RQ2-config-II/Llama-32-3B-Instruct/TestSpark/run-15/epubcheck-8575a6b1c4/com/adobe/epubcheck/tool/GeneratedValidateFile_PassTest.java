package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

public class GeneratedValidateFile_PassTest {

    @Test
    public void validateFile_PassTest() throws IOException, GalimatiasParseException {
        File file = new File("valid.epub");
        EpubChecker instance = new EpubChecker();
        int result = instance.validateFile(file.getAbsolutePath(), EpubCheckFactory.EPUB3, new CheckingReport(), new EPUBProfile());
        assertTrue(result == 0);
    }

}