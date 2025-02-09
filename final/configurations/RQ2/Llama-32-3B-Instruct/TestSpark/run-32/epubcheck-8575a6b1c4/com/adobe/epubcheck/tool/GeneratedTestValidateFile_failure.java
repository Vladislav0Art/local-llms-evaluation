package com.adobe.epubcheck.tool;

public class GeneratedTestValidateFile_failure {

    private EpubChecker epubChecker = new EpubChecker();

    @Test
    public void testValidateFile_failure() {
        String filePath = "/path/to/file";
        int version = EPUBVersion.EPUB20;
        DefaultReportImpl newReport = new DefaultReportImpl();
        newReport.setFailure(true);
        newReport.setErrorMessage("Error message");
        int result = epubChecker.validateFile(filePath, version, newReport);
        assertTrue(result == 1);
    }
}

}