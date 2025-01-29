package com.adobe.epubcheck.tool;

public class GeneratedTestEpubChecker_validateFile_ValidationContextValidation {

    @Test
    public void testEpubChecker_validateFile_ValidationContextValidation() {
        File file = new File("path/to/file.epub");
        EpubChecker checker = new EpubChecker();
        Report report = checker.validateFile(file, "current", null, EPUBProfile.SANDBOX);
        Assertions.assertEquals(ReportLevel.FINEST, report.getReportLevel());
    }

}