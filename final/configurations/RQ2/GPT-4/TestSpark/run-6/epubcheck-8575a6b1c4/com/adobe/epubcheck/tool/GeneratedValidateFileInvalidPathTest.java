package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValidateFileInvalidPathTest {

    @Test
    public void validateFileInvalidPathTest() {
        EpubChecker checker = new EpubChecker();
        DefaultReportImpl report = new DefaultReportImpl();
        int result = checker.validateFile("/invalid/path", EPUBVersion.VERSION_3, report, EPUBProfile.DEFAULT);
        assertNotEquals("Expect non-zero when invalid path is passed", 0, result);
    }

}