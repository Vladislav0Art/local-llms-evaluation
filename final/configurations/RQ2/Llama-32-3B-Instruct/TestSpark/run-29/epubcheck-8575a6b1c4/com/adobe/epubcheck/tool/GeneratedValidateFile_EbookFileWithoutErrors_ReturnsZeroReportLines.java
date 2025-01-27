package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedValidateFile_EbookFileWithoutErrors_ReturnsZeroReportLines {

    @Test
    public void validateFile_EbookFileWithoutErrors_ReturnsZeroReportLines() {
        String path = "file.ebk";
        EPUBVersion version = new EPUBVersion();
        Report report = new DefaultReportImpl();
        int result = (int) epubChecker.validateFile(path, version, report, null);
        assertEquals(0, result);
    }

}