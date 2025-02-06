package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;

public class GeneratedValidateFile_InvalidEpubFile_ReturnsNonZeroResult {

    @Test
    public void validateFile_InvalidEpubFile_ReturnsNonZeroResult() throws Exception {
        File invalidEpubFile = new File("path/to/invalid/epub/file.epub");
        int result = new EpubChecker().validateFile(invalidEpubFile.toURI(), EPUBVersion.V30, null, null);
        assertTrue(result != 0);
    }

}