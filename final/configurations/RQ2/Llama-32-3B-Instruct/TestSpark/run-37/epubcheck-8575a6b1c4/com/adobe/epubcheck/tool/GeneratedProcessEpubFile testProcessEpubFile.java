package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedProcessEpubFile testProcessEpubFile {

    @Test
    public void processEpubFile

    testProcessEpubFile() {
        @Deprecated
        String[] args = {"arg1", "arg2"};
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.processEpubFile(args);
        assertTrue(result >= 0 && result < 1000000);
    }

}