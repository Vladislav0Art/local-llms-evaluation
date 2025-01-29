package com.adobe.epubcheck.tool;

public class GeneratedTestValidateEpubFile_InvalidProfile_3 {

    public MockChecker mockChecker;
    public FileResourceProvider resourceProvider;

    @Before
    public void setup() {
        mockChecker = new MockChecker();
        resourceProvider = new MockResourceProvider();
    }

    @Test
    public void testValidateEpubFile_InvalidProfile_3() {
        String path = "path/to/file.epub";
        Report report = new DefaultReportImpl();
        EPUBVersion version = null;
        null;

        int result = mockChecker.validateFile(path, version, report, profile);
        assertEquals(-1, result);
    }

}