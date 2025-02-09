package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Locale;

public class GeneratedValidateFileValidArgsTest {

    @Test
    public void validateFileValidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        Report report = new DefaultReportImpl("testFile.epub");
        EPUBProfile profile = EPUBProfile.OPF_2_0;
        int result = epubChecker.validateFile("testFile.epub", EPUBVersion.VERSION_2_0, report, profile);
        assertEquals(0, result);
        assertTrue(report.getErrors().isEmpty());
    }

}