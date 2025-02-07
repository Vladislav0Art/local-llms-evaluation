package com.adobe.epubcheck.tool;

public class GeneratedTestValidateFileNoReport {

    @Test
    public void testValidateFileNoReport() {
        EpubChecker checker = new EpubCheckerImpl();
        int result = checker.validateFile("path/to/your/file.epub", EPUBVersion.LATEST, null, EPUBProfile.standard);
        assertEquals(1, result); // 1 if the file is invalid or not found
    }

}