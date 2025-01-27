package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedValidateFile_EbookFileWithErrors_ReturnsNonZeroReportLines {

    @Test
    public void validateFile_EbookFileWithErrors_ReturnsNonZeroReportLines() {
        String path = "file.ebk";
        EPUBVersion version = new EPUBVersion();
        Report report = new DefaultReportImpl();
        int result = (int) epubChecker.validateFile(path, version, report, null);
        assertTrue(result > 0);
    }

}