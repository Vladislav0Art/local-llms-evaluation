package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedValidateFile_invalidFileReturnsCorrectResult_1Test {

    @Test
    public void validateFile_invalidFileReturnsCorrectResult_1Test() {
        File file = new File("invalid_file.epub");
        EPUBVersion version = EPUBVersion.EPUB20;
        Report report = new DefaultReportImpl();
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.validateFile(file.getAbsolutePath(), version, report, null);
        assertTrue(result == 1);
    }

}