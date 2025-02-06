package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class GeneratedValidateFile_validateWithInvalidEPUBFile_ReturnsNonZeroErrors {

    @Test
    public void validateFile_validateWithInvalidEPUBFile_ReturnsNonZeroErrors() throws Exception {
        File epubFile = new File("path/to/invalid/epubfile.epub");
        EpubChecker epubChecker = new EpubChecker();
        int errors = epubChecker.validateFile(epubFile.getAbsolutePath(), EPUBVersion.V3, null, null);
        assertNotEquals(0, errors);
    }

}