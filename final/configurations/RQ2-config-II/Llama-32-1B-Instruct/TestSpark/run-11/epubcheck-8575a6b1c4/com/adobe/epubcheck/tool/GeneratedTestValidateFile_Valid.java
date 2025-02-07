package com.adobe.epubcheck.tool;

public class GeneratedTestValidateFile_Valid {

    @Test
    public void testValidateFile_Valid() {
        EpubChecker checker = new EpubChecker();
        File file = new File("path/to/your/file");
        try {
            checker.validateFile(file.getAbsolutePath(), EPUBVersion.V1, ReportFactory.createReport(), EPUBProfileFactory.createEPUB());
            // Expected
        } catch (InvalidVersionException e) {
            fail("Expected InvalidVersionException to be thrown");
        }
    }

}