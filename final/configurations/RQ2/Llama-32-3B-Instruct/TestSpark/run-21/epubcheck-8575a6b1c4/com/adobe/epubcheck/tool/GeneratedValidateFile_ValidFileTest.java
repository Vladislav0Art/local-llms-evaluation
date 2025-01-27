package com.adobe.epubcheck.tool;

public class GeneratedValidateFile_ValidFileTest {

    @Test
    public void validateFile_ValidFileTest() throws Exception {
        File input_file = new File(System.getProperty("user.dir") + "/test.epub");
        EpubChecker instance = new EpubChecker();
        int result = instance.validateFile(input_file.getAbsolutePath(), EPUBVersion.v20, new DefaultReportImpl(), new LocalizableReport());
        assertNotNull(result);
    }

}