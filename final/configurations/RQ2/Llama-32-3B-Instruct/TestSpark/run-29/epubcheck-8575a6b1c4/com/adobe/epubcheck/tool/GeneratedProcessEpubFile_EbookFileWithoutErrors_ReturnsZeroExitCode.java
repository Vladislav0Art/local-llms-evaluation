package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedProcessEpubFile_EbookFileWithoutErrors_ReturnsZeroExitCode {

    @Test
    public void processEpubFile_EbookFileWithoutErrors_ReturnsZeroExitCode() {
        String[] args = {"file.ebk"};
        EpubChecker epubChecker = new EpubChecker();
        int result = (int) epubChecker.processEpubFile(args);
        assertEquals(0, result);
    }

}