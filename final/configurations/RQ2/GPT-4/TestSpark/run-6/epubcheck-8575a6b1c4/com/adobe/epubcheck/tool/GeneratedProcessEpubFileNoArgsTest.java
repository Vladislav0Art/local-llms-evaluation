package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedProcessEpubFileNoArgsTest {

    @Test
    public void processEpubFileNoArgsTest() {
        EpubChecker checker = new EpubChecker();
        int result = checker.processEpubFile(new String[]{});
        assertEquals("Expect 0 when no arguments are passed", 0, result);
    }

}