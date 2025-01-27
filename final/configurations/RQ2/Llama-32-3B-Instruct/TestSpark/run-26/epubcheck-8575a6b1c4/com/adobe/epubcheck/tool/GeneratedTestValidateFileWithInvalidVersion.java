package com.adobe.epubcheck.tool;

public class GeneratedTestValidateFileWithInvalidVersion {

    @Test
    public void testValidateFileWithInvalidVersion() {
        File file = new File("valid.epub");
        try {
            checker.validateFile(file.toURI(), EPUBVersion.EPB5, null, null);
            fail("Expected InvalidException");
        } catch (InvalidException e) {
            // expected
        }
    }

    public enum EPUBVersion {
        EB3,
        EB4,
        EB5
    }

}