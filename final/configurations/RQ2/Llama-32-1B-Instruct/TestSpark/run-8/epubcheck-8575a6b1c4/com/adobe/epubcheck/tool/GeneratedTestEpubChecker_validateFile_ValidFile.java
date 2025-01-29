package com.adobe.epubcheck.tool;

public class GeneratedTestEpubChecker_validateFile_ValidFile {

    @Test
    public void testEpubChecker_validateFile_ValidFile() {
        File file = new File("path/to/file.epub");
        EpubChecker checker = new EpubChecker();
        Report report = checker.validateFile(file, EPUBVersion.VALID, Report(report -> report.setReportLevel(ReportingLevel.FINEST)), null);
        Assertions.assertEquals(ReportLevel.FINEST, report.getReportLevel());
    }

}