package com.adobe.epubcheck.tool;

public class GeneratedValidateFileValidFileTest {

    private static final File tmpFile = File.createTempFile("epub-checker", ".tmp");

    @Test
    public void validateFileValidFileTest() throws Exception {
        File input_file = new File(tmpFile.getParent(), "input.epub");
        EpubChecker instance = new EpubChecker();
        int result = instance.validateFile(input_file.getAbsolutePath(), EPUBVersion.v20, new DefaultReportImpl(), new LocalizableReport());
        assertNotNull(result);
    }

}