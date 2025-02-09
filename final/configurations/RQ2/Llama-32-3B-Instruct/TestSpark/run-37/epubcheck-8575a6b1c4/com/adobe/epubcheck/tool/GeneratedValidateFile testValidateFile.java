package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedValidateFile testValidateFile {

    @Test
    public void validateFile

    testValidateFile() {
        String path = "/path/to/file";
        EPUBVersion version = EPUBVersion.EPUB3;
        Report report = new DefaultReportImpl();
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.validateFile(path, version, report, new EPUBProfile());
        assertTrue(result >= 0 && result < 1000000);
    }

}