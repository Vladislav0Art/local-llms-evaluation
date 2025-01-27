package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedProcessEpubFile {

    @Test
    public void processEpubFile() {
        EpubChecker checker = new EpubChecker();
        String[] argsArray = {"path", "version"};
        int result = checker.processEpubFile(argsArray);
        assertEquals(0, result);
    }

}