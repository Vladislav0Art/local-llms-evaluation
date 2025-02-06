package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class GeneratedValidateFile_validateWithValidEPUBFile_ReturnsZeroErrors {

    @Test
    public void validateFile_validateWithValidEPUBFile_ReturnsZeroErrors() throws Exception {
        File epubFile = new File("path/to/valid/epubfile.epub");
        EpubChecker epubChecker = new EpubChecker();
        int errors = epubChecker.validateFile(epubFile.getAbsolutePath(), EPUBVersion.V3, null, null);
        assertEquals(0, errors);
    }

}