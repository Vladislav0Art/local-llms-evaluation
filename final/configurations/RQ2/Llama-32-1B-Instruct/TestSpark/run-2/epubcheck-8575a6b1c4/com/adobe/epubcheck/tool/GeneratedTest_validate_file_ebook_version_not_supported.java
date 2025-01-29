package com.adobe.epubcheck.tool;

public class GeneratedTest_validate_file_ebook_version_not_supported {

    @Test
    public void test_validate_file_ebook_version_not_supported() {
        String[] args = {"/path/to/file.epub", "2.0", new Report(), null};
        EpubChecker checker = new EpubChecker();
        int result = checker.validateFile(args[0], EPUBVersion.V1_9, ReportFactory.createDefaultReport(ValidationContextBuilder.builder().build()), EPUBProfile.EPUB30);
        assertEquals(EpubCheckResult.PASSED, result);
    }

}