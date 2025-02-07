package com.adobe.epubcheck.tool;

public class GeneratedTestValidateFile_InvalidProfile {

    @Test
    public void testValidateFile_InvalidProfile() {
        EpubChecker checker = new EpubChecker();
        File file = new File("path/to/your/file");
        try {
            checker.validateFile(file.getAbsolutePath(), EPUBVersion.V1, ReportFactory.createReport(null), null);
            fail("Expected InvalidVersionException to be thrown");
        } catch (InvalidVersionException e) {
            // Expected
        }
    }

}