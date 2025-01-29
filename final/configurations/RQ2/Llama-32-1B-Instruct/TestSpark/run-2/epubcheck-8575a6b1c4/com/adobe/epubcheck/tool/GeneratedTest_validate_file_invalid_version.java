package com.adobe.epubcheck.tool;

public class GeneratedTest_validate_file_invalid_version {

    @Test
    public void test_validate_file_invalid_version() {
        String[] args = {"/path/to/file.epub", "2.0", new DefaultReportImpl(), "com.adobe.epubcheck.tool.EpubChecker"};
        EpubChecker checker = new EpubChecker();
        int result = checker.validateFile(args[0], EPUBVersion.V1_9, ReportFactory.createDefaultReport(ValidationContextBuilder.builder().build()), EPUBProfile.EPUB30);
        assertEquals(EpubCheckResult.PASSED, result);
    }

}