package com.adobe.epubcheck.tool;

public class GeneratedTestValidateFile_InvalidReport {

    @Test
    public void testValidateFile_InvalidReport() {
        EpubChecker checker = new EpubChecker();
        File file = new File("path/to/your/file");
        try {
            checker.validateFile(file.getAbsolutePath(), "Invalid", null, EPUBProfileFactory.createEPUB());
            fail("Expected InvalidVersionException to be thrown");
        } catch (InvalidVersionException e) {
            // Expected
        }
    }

}