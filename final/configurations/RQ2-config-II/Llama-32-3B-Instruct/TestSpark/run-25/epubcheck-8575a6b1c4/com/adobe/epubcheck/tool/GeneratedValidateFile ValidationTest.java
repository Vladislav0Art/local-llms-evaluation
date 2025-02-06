package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedValidateFile ValidationTest {

    @Test
    public void validateFile

    ValidationTest() {
        String path = "test.epub";
        EPUBVersion version = EPUBVersion.EPUB3;
        Report report = new DefaultReportImpl();
        EpubChecker checker = new EpubChecker();
        int result = checker.validateFile(path, version, report, null);
        assertTrue(result >= 0);
    }

}