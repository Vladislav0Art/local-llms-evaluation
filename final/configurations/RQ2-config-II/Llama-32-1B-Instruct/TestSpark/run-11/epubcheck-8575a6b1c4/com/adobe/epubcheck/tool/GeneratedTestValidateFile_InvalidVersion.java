package com.adobe.epubcheck.tool;

public class GeneratedTestValidateFile_InvalidVersion {

    @Test
    public void testValidateFile_InvalidVersion() {
        EpubChecker checker = new EpubChecker();
        File file = new File("path/to/your/file");
        try {
            checker.validateFile(file.getAbsolutePath(), "Invalid", ReportFactory.createReport(), EPUBProfileFactory.createEPUB());
            fail("Expected InvalidVersionException to be thrown");
        } catch (InvalidVersionException e) {
            // Expected
        }
    }

}