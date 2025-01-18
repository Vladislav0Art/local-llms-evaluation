package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedProcessEpubFileWithErrorArgsTest {

    @Test
    public void processEpubFileWithErrorArgsTest() {
        EpubChecker checker = new EpubChecker();
        int result = checker.processEpubFile(new String[]{"-invalid"});
        assertNotEquals("Expect non-zero when invalid arguments are passed", 0, result);
    }

}