package com.adobe.epubcheck.tool;

public class GeneratedTestEpubChecker_validateFile_Opfc Checker_InvalidVersion {

    @Test
    public void testEpubChecker_validateFile_Opfc

    Checker_InvalidVersion() {
        File file = new File("path/to/file.epub");
        EpubChecker checker = new EpubChecker();
        try {
            checker.validateFile(file, "invalid", Report(report -> report.setReportLevel(ReportingLevel.FINEST)), null);
            Assertions.fail("Expected InvalidVersionException");
        } catch (InvalidVersionException e) {
            // Expected
        }
    }

}