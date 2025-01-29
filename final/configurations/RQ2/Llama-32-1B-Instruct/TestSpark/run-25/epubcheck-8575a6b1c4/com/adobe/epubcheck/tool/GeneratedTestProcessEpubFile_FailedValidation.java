package com.adobe.epubcheck.tool;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestProcessEpubFile_FailedValidation {

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
    public void testProcessEpubFile_FailedValidation() {
        String[] args = {"path/to/file.epub"};
        EpubChecker checker = new EpubChecker();
        Report report = new DefaultReportImpl();
        EPUBVersion version = null;
        mockChecker.validateFile(null, null, report, profile);

        assertEquals(-1, checker.processEpubFile(args).intValue());
    }

}