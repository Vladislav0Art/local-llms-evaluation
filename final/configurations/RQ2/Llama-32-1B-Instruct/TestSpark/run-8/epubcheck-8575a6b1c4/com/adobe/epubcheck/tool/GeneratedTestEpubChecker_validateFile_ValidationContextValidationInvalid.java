package com.adobe.epubcheck.tool;

public class GeneratedTestEpubChecker_validateFile_ValidationContextValidationInvalid {

    @Test
    public void testEpubChecker_validateFile_ValidationContextValidationInvalid() {
        File file = new File("path/to/file.epub");
        EpubChecker checker = new EpubChecker();
        try {
            checker.validateFile(file, "current", EPUBProfile.SANDBOX, null);
            Assertions.fail("Expected ValidationException");
        } catch (ValidationException e) {
            // Expected
        }
    }

}