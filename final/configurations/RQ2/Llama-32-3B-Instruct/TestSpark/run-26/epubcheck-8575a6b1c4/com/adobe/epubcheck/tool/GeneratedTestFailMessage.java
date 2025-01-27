package com.adobe.epubcheck.tool;

public class GeneratedTestFailMessage {

    @Test
    public void testFailMessage() {
        File file = new File("valid.epub");
        try {
            checker.validateFile(file.toURI(), EPUBVersion.EPB4, null, null);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

}