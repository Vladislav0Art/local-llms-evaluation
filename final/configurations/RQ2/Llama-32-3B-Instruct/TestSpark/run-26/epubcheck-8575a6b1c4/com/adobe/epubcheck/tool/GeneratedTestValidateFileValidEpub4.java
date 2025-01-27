package com.adobe.epubcheck.tool;

public class GeneratedTestValidateFileValidEpub4 {

    @Test
    public void testValidateFileValidEpub4() throws Exception {
        File file = new File("valid.epub");
        int result = checker.validateFile(file.toURI(), EPUBVersion.EPB4, null, null);
        assertTrue(result > 0);
    }

}