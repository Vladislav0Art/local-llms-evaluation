package com.adobe.epubcheck.tool;

public class GeneratedTestEpubChecker_validateFile_ValidationContextInvalid {

    @Test
    public void testEpubChecker_validateFile_ValidationContextInvalid() {
        File file = new File("path/to/file.epub");
        EpubChecker checker = new EpubChecker();
        try {
            checker.validateFile(file, "current", null, EPUBProfile.SANDBOX);
            Assertions.fail("Expected ValidationException");
        } catch (ValidationException e) {
            // Expected
        }
    }

}