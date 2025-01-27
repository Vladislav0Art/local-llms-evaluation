package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedProcessEpubFile DeprecatedTest {

    @Test
    public void processEpubFile

    DeprecatedTest() {
        @Deprecated String[] args = {"path", "profile"};
        EpubChecker instance = new EpubChecker();
        int result = instance.processEpubFile(args);
        assertTrue(result == -1);
    }

}