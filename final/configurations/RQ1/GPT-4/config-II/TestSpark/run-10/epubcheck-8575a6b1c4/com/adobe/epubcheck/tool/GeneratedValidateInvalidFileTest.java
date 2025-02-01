package com.adobe.epubcheck.tool;

import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.*;

public class GeneratedValidateInvalidFileTest {


    private EpubChecker epubChecker;

    @Test
    public void validateInvalidFileTest() {
        epubChecker = new EpubChecker();
        int result = epubChecker.validateFile("invalid", EPUBVersion.VERSION_3, new DefaultReportImpl("path"), EPUBProfile.DEFAULT);
        assertEquals(1, result);
    }

}