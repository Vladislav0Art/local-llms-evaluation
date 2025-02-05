package com.adobe.epubcheck.tool;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedValidateFileInvalidPathTest {

    @Test
    public void validateFileInvalidPathTest() {
        EpubChecker epubChecker = new EpubChecker();
        String path = "invalidPath";
        EPUBVersion version = EPUBVersion.VERSION_3;
        Report report = new DefaultReportImpl("invalidPath");
        EPUBProfile profile = EPUBProfile.DEFAULT;
        assertEquals(-1, epubChecker.validateFile(path, version, report, profile));
    }

}