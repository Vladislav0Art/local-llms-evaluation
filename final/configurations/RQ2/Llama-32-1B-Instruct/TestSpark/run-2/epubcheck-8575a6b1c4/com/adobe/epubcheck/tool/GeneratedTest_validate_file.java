package com.adobe.epubcheck.tool;

public class GeneratedTest_validate_file {

    @Test
    public void test_validate_file() {
        String[] args = {"/path/to/file.epub", "1.0", new DefaultReportImpl(), "com.adobe.epubcheck.tool.EpubChecker"};
        EpubChecker checker = new EpubChecker();
        int result = checker.validateFile(args[0], EPUBVersion.V1_9, ReportFactory.createDefaultReport(ValidationContextBuilder.builder().build()), EPUBProfile.EPUB30);
        assertEquals(EpubCheckResult.PASSED, result);
    }

}