package com.adobe.epubcheck.tool;

public class GeneratedTestValidateFileInvalidEpub4 {

    @Test
    public void testValidateFileInvalidEpub4() {
        File file = new File("invalid.epub");
        try {
            checker.validateFile(file.toURI(), EPUBVersion.EPB4, null, null);
            fail("Expected InvalidException");
        } catch (InvalidException e) {
            // expected
        }
    }

}