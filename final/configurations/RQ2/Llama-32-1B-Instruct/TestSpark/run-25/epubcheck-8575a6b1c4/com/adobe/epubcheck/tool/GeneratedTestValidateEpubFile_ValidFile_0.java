package com.adobe.epubcheck.tool;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestValidateEpubFile_ValidFile_0 {

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
    public void testValidateEpubFile_ValidFile_0() {
        String path = "path/to/file.epub";
        EPUBVersion version = EPUBVersion.V1;
        Report report = new DefaultReportImpl();
        EPUBProfile profile = null;

        int result = mockChecker.validateFile(path, version, report, profile);
        assertEquals(0, result);
    }

}