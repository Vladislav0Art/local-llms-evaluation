package com.adobe.epubcheck.tool;

public class GeneratedValidateFile_UnknownFormat {

    @Test
    public void validateFile_UnknownFormat() throws Exception {
        File input_file = tmpFile;
        EpubChecker instance = new EpubChecker();
        int result = instance.validateFile(input_file.getAbsolutePath(), EPUBVersion.v20, new DefaultReportImpl(), "unknown-format");
        assertNotNull(result);
    }

}