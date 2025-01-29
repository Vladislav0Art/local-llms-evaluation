package com.adobe.epubcheck.tool;

public class GeneratedTestEpubChecker_validateFile_Opfc Checker {

    @Test
    public void testEpubChecker_validateFile_Opfc

    Checker() {
        File file = new File("path/to/file.epub");
        EpubChecker checker = new EpubChecker();
        OpfChecker opfChecker = checker.validateFile(file, "current", EPUBProfile.SANDBOX, null);
        Assertions.assertEquals(ReportLevel.FINEST, opfChecker.getReportLevel());
    }

}