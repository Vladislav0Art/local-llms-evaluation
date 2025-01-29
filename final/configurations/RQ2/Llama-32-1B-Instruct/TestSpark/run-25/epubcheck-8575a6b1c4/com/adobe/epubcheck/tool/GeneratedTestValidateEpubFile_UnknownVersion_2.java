package com.adobe.epubcheck.tool;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestValidateEpubFile_UnknownVersion_2 {

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
    public void testValidateEpubFile_UnknownVersion_2() {
        String path = "path/to/file.epub";
        Report report = new DefaultReportImpl();
        EPUBProfile profile = null;
        mockChecker.validateFile(path, version, report, profile);

        assertEquals(-1, mockChecker.validateFile(null, null, report, profile).intValue());
    }

}