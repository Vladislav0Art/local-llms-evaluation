package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValidateFileValidPathTest {

    @Test
    public void validateFileValidPathTest() {
        EpubChecker checker = new EpubChecker();
        DefaultReportImpl report = new DefaultReportImpl();
        // assuming existing valid file
        int result = checker.validateFile("/valid/path/to/file", EPUBVersion.VERSION_3, report, EPUBProfile.DEFAULT);
        assertEquals("Expect zero when valid path and EPUB VERSION_3 type are passed", 0, result);
    }

}