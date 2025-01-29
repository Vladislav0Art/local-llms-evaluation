package com.adobe.epubcheck.tool;

public class GeneratedTestEpubChecker_validateFile_Opfc Checker_ValidFile {

    @Test
    public void testEpubChecker_validateFile_Opfc

    Checker_ValidFile() {
        File file = new File("path/to/file.epub");
        EpubChecker checker = new EpubChecker();
        Report report = checker.validateFile(file, "current", EPUBProfile.SANDBOX, null);
        Assertions.assertEquals(ReportLevel.FINEST, report.getReportLevel());
    }

}