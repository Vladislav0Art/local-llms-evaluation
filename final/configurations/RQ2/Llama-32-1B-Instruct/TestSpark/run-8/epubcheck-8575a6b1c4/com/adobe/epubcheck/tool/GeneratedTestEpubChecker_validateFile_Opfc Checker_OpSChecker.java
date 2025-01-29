package com.adobe.epubcheck.tool;

public class GeneratedTestEpubChecker_validateFile_Opfc Checker_OpSChecker {

    @Test
    public void testEpubChecker_validateFile_Opfc

    Checker_OpSChecker() {
        File file = new File("path/to/file.epub");
        EpubChecker checker = new EpubChecker();
        OpSChecker opscChecker = checker.validateFile(file, "current", EPUBProfile.SANDBOX, null);
        Assertions.assertEquals(ReportLevel.FINEST, opscChecker.getReportLevel());
    }

}