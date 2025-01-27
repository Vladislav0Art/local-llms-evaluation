package com.adobe.epubcheck.tool;

public class GeneratedTestValidateFileInvalidEpub3 {

    @Test
    public void testValidateFileInvalidEpub3() {
        File file = new File("invalid.epub");
        try {
            checker.validateFile(file.toURI(), EPUBVersion.EPB3, null, null);
            fail("Expected InvalidException");
        } catch (InvalidException e) {
            // expected
        }
    }

}