package com.adobe.epubcheck.tool;

public class GeneratedValidateFileInvalidFileTest {

    private static final File tmpFile = File.createTempFile("epub-checker", ".tmp");

    @Test
    public void validateFileInvalidFileTest() throws Exception {
        File input_file = new File(tmpFile.getParent(), "invalid.epub");
        EpubChecker instance = new EpubChecker();
        int result = instance.validateFile(input_file.getAbsolutePath(), EPUBVersion.v20, new DefaultReportImpl(), new LocalizableReport());
        assertNotNull(result);
    }

}