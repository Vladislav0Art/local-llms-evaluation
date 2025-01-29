package com.adobe.epubcheck.tool;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestValidateEpubFile_FailedValidation {

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
    public void testValidateEpubFile_FailedValidation() {
        String path = "path/to/file.epub";
        Report report = new DefaultReportImpl();
        EPUBVersion version = null;
        mockChecker.validateFile(path, version, report, null);

        assertEquals(-1, mockChecker.validateFile(null, null, report, null).intValue());
    }

}