package com.adobe.epubcheck.tool;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestProcessEpubFile_ValidFile {

    private MockChecker mockChecker;
    private FileResourceProvider resourceProvider;

    @Before
    public void setup() {
        mockChecker = new MockChecker();
        resourceProvider = new MockResourceProvider();
    }

    @After
    public void tearDown() {
        mockChecker.close();
    }

    @Test
    public void testProcessEpubFile_ValidFile() {
        String[] args = {"path/to/file.epub"};
        EpubChecker checker = new EpubChecker();
        int result = checker.processEpubFile(args);
        assertEquals(0, result);
    }

}