package com.adobe.epubcheck.tool;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestValidateEpubFile_InvalidFile_1 {

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
    public void testValidateEpubFile_InvalidFile_1() {
        String path = "path/to/invalid/file.epub";
        EPUBVersion version = null;
        Report report = new DefaultReportImpl();
        EPUBProfile profile = null;

        int result = mockChecker.validateFile(path, version, report, profile);
        assertEquals(-1, result);
    }

}