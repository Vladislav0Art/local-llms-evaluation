package com.adobe.epubcheck.tool;

public class GeneratedValidateFile_InvalidFileTest {

    @Test
    public void validateFile_InvalidFileTest() throws Exception {
        File input_file = new File(System.getProperty("user.dir") + "/non-existent-file.epub");
        EpubChecker instance = new EpubChecker();
        int result = instance.validateFile(input_file.getAbsolutePath(), EPUBVersion.v20, new DefaultReportImpl(), new LocalizableReport());
        assertNotNull(result);
    }

}