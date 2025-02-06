package com.adobe.epubcheck.tool;

public class GeneratedValidateFile_validateWithEpubProfile {

    private EpubChecker underTest = new EpubChecker();

    @Test
    public void validateFile_validateWithEpubProfile() throws Exception {
        File tmpFile = File.createTempFile("tmp", ".epub");
        String[] args = new String[]{tmpFile.getAbsolutePath(), "--validate", "--profile"};
        int result = underTest.validateFile(tmpFile.getAbsolutePath(), null, null, "profile1");
        assertTrue(result == 0);
        assertTrue(tmpFile.delete());
    }

}