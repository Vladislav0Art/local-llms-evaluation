package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class GeneratedProcessEpubFile_ValidFile_ReturnsZero {

    @Test
    public void processEpubFile_ValidFile_ReturnsZero() {
        @Deprecated
        EpubChecker checker = new EpubChecker();
        int result = checker.processEpubFile(new String[]{});
        assertEquals(0, result);
    }

}