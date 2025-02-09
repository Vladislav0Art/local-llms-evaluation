package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedProcessEpubFile_invalidArgs testProcessEpubFileInvalidArgs {

    @Test
    public void processEpubFile_invalidArgs

    testProcessEpubFileInvalidArgs() {
        @Deprecated
        String[] args = {"arg1", null};
        EpubChecker epubChecker = new EpubChecker();
        try {
            int result = epubChecker.processEpubFile(args);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }

}