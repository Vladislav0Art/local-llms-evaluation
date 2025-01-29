package com.adobe.epubcheck.tool;

public class GeneratedTestValidateFile {

    @Test
    public void testValidateFile() throws Exception {
        String report = "Validating file";
        String version = "1.0";
        String profile = "Public";
        int returnCode = EpubChecker.validateFile(report, version, profile);
        assertEquals(0, returnCode);
    }

}