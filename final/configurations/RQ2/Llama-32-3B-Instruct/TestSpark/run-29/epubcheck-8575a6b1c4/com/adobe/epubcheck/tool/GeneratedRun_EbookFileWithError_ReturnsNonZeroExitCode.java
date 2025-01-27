package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedRun_EbookFileWithError_ReturnsNonZeroExitCode {

    @Test
    public void run_EbookFileWithError_ReturnsNonZeroExitCode() {
        String[] args = {"file.ebk", "--error"};
        EpubChecker epubChecker = new EpubChecker();
        int result = (int) epubChecker.run(args);
        assertFalse(result == 0);
    }

}