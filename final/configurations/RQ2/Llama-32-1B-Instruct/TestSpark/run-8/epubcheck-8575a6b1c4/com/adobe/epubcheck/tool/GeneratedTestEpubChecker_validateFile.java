package com.adobe.epubcheck.tool;

public class GeneratedTestEpubChecker_validateFile {

    @Test
    public void testEpubChecker_validateFile() {
        File file = new File("path/to/file.epub");
        EpubChecker checker = new EpubChecker();
        Report report = checker.validateFile(file, "current", EPUBProfile.SANDBOX, null);
        Assertions.assertEquals(ReportLevel.FINEST, report.getReportLevel());
    }

}