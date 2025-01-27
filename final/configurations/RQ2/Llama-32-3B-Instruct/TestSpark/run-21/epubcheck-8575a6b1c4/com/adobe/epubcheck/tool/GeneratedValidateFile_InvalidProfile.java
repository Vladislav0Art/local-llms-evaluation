package com.adobe.epubcheck.tool;

public class GeneratedValidateFile_InvalidProfile {

    @Test
    public void validateFile_InvalidProfile() throws Exception {
        File input_file = tmpFile;
        EpubChecker instance = new EpubChecker();
        int result = instance.validateFile(input_file.getAbsolutePath(), EPUBVersion.v20, new DefaultReportImpl(), "invalid-profile");
        assertNotNull(result);
    }

}