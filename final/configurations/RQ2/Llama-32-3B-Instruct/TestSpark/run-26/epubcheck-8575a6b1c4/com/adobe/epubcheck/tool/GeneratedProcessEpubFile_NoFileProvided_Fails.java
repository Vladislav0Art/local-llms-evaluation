package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedProcessEpubFile_NoFileProvided_Fails {

    @Test
    public void processEpubFile_NoFileProvided_Fails() {
        String[] args = {};
        EpubChecker checker = new EpubChecker();
        int result = checker.processEpubFile(args);
        assertEquals(1, result); // assumes default behavior throws an exception
    }

}