package com.adobe.epubcheck.tool;

public class GeneratedTestValidateFileValidEpub3 {

    @Test
    public void testValidateFileValidEpub3() throws Exception {
        File file = new File("valid.epub");
        int result = checker.validateFile(file.toURI(), EPUBVersion.EPB3, null, null);
        assertTrue(result > 0);
    }

}