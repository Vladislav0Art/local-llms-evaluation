package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Locale;

public class GeneratedValidateFileInvalidArgsTest {

    @Test
    public void validateFileInvalidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        Report report = new DefaultReportImpl("nonexistent.epub");
        EPUBProfile profile = EPUBProfile.OPF_2_0;
        int result = epubChecker.validateFile("nonexistent.epub", EPUBVersion.VERSION_2_0, report, profile);
        assertEquals(1, result);
        assertFalse(report.getErrors().isEmpty());
    }

}