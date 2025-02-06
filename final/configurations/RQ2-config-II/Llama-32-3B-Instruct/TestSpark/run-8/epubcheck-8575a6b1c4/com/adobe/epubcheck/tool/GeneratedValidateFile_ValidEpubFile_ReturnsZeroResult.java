package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;

public class GeneratedValidateFile_ValidEpubFile_ReturnsZeroResult {

    @Test
    public void validateFile_ValidEpubFile_ReturnsZeroResult() throws Exception {
        File epubFile = new File("path/to/valid/epub/file.epub");
        int result = new EpubChecker().validateFile(epubFile.toURI(), EPUBVersion.V30, null, null);
        assertTrue(result == 0);
    }

}