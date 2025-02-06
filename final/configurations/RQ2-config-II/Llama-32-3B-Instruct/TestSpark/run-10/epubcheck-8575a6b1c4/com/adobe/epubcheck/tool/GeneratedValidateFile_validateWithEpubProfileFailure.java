package com.adobe.epubcheck.tool;

public class GeneratedValidateFile_validateWithEpubProfileFailure {

    private EpubChecker underTest = new EpubChecker();

    @Test
    public void validateFile_validateWithEpubProfileFailure() throws Exception {
        File tmpFile = File.createTempFile("tmp", ".invalid");
        String[] args = new String[]{tmpFile.getAbsolutePath(), "--validate", "--profile"};
        int result = underTest.validateFile(tmpFile.getAbsolutePath(), null, null, "profile1");
        assertTrue(result != 0);
        assertTrue(tmpFile.delete());
    }

}