package com.adobe.epubcheck.tool;

public class GeneratedValidateFile_validateFailure {

    private EpubChecker underTest = new EpubChecker();

    @Test
    public void validateFile_validateFailure() throws Exception {
        File tmpFile = File.createTempFile("tmp", ".invalid");
        String[] args = new String[]{tmpFile.getAbsolutePath(), "--validate"};
        int result = underTest.validateFile(tmpFile.getAbsolutePath(), null, null, null);
        assertTrue(result != 0);
        assertTrue(tmpFile.delete());
    }

}