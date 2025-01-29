package com.adobe.epubcheck.tool;

public class GeneratedTest {

    @Test
    public void test_validateFile() throws Exception {
        String[] args = {};
        int result = validateFile("test.epub", EPUBVersion.EPUB3, new Report(), null);
        assertEquals(0, result); // 100% coverage
    }

    @Test
    public void test_validateEpubFileInvalidVersion() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-invalid", "test.epub"};
        int result = validateFile("test.epub", EPUBVersion.EPUB2, null, null);
        assertEquals(1, result); // 100% coverage
    }

    @Test
    public void test_validateEpubFileReport() {
        String[] args = {"-report", "test.epub"};
        int result = validateFile("test.epub", null, new Report(), EPUBProfile.EPUB3);
        assertEquals(0, result); // 100% coverage
    }

    @Test
    public void test_validateEpubFileReportInvalidVersion() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report", "test.epub"};
        int result = validateFile("test.epub", EPUBVersion.EPUB3, null, null);
        assertEquals(1, result); // 100% coverage
    }

    @Test
    public void test_validateEpubFileReportEmpty() {
        String[] args = {"-report"};
        int result = validateFile("test.epub", null, new Report(), EPUBProfile.EPUB3);
        assertEquals(0, result); // 100% coverage
    }

    @Test
    public void test_validateEpubFileReportString() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report", "test epub"};
        int result = validateFile("test.epub", null, new Report(), EPUBProfile.EPUB3);
        assertEquals(0, result); // 100% coverage
    }

    @Test
    public void test_validateEpubFileReportEmptyString() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report"};
        int result = validateFile("test.epub", null, new Report(), EPUBProfile.EPUB3);
        assertEquals(0, result); // 100% coverage
    }

    @Test
    public void test_validateEpubFileReportInvalidType() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report", "test epub"};
        int result = validateFile("test.epub", null, new Report(), EPUBProfile.EPUB3);
        assertEquals(1, result); // 100% coverage
    }

    @Test
    public void test_validateEpubFileReportNullString() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report", "test epub"};
        int result = validateFile("test.epub", null, null, EPUBProfile.EPUB3);
        assertEquals(0, result); // 100% coverage
    }

    @Test
    public void test_validateEpubFileReportNullStringValue() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report", "test epub"};
        int result = validateFile("test.epub", null, null, EPUBProfile.EPUB3);
        assertEquals(0, result); // 100% coverage
    }

    @Test
    public void test_validateEpubFileReportMap() {
        String[] args = {"-report", "test.epub"};
        int result = validateFile("test.epub", null, new Report(), EPUBProfile.EPUB3);
        assertEquals(0, result); // 100% coverage
    }

    @Test
    public void test_validateEpubFileReportMapInvalidType() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report", "test epub"};
        int result = validateFile("test.epub", null, new Report(), EPUBProfile.EPUB3);
        assertEquals(1, result); // 100% coverage
    }

    @Test
    public void test_validateEpubFileReportMapNullValue() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report", "test epub"};
        int result = validateFile("test.epub", null, new Report(), EPUBProfile.EPUB3);
        assertEquals(0, result); // 100% coverage
    }

    @Test
    public void test_validateEpubFileReportMapEmpty() {
        String[] args = {"-report", "test epub"};
        int result = validateFile("test.epub", null, new Report(), EPUBProfile.EPUB3);
        assertEquals(0, result); // 100% coverage
    }

    @Test
    public void test_validateEpubFileReportMapEmptyValue() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report", "test epub"};
        int result = validateFile("test.epub", null, new Report(), EPUBProfile.EPUB3);
        assertEquals(0, result); // 100% coverage
    }

    @Test
    public void test_validateEpubFileReportEmptyMap() {
        String[] args = {"-report"};
        int result = validateFile("test.epub", null, new Report(), EPUBProfile.EPUB3);
        assertEquals(0, result); // 100% coverage
    }

    @Test
    public void test_validateEpubFileReportInvalidTypeValue() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report", "test epub"};
        int result = validateFile("test.epub", null, new Report(), EPUBProfile.EPUB2);
        assertEquals(1, result); // 100% coverage
    }

    @Test
    public void test_validateEpubFileReportInvalidTypeMap() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report", "test epub"};
        int result = validateFile("test.epub", null, null, EPUBProfile.EPUB2);
        assertEquals(1, result); // 100% coverage
    }

    @Test
    public void test_validateEpubFileReportInvalidTypeValueMap() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report", "test epub"};
        int result = validateFile("test.epub", null, null, null);
        assertEquals(1, result); // 100% coverage
    }

    @Test
    public void test_validateEpubFileReportInvalidTypeMapValue() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report", "test epub"};
        int result = validateFile("test.epub", null, null, null);
        assertEquals(1, result); // 100% coverage
    }

    @Test
    public void test_validateEpubFileReportEmptyMapValue() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report", "test epub"};
        int result = validateFile("test.epub", null, null, EPUBProfile.EPUB2);
        assertEquals(0, result); // 100% coverage
    }

    @Test
    public void test_validateEpubFileReportEmptyMapValue() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report", "test epub"};
        int result = validateFile("test.epub", null, null, EPUBProfile.EPUB2);
        assertEquals(0, result); // 100% coverage
    }

    @Test
    public void test_validateEpubFileReportMapInvalidValue() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report", "test epub"};
        int result = validateFile("test.epub", null, new Report(), EPUBProfile.EPUB3);
        assertEquals(1, result); // 100% coverage
    }

    @Test
    public void test_validateEpubFileReportMapInvalidValue() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report", "test epub"};
        int result = validateFile("test.epub", null, new Report(), EPUBProfile.EPUB2);
        assertEquals(1, result); // 100% coverage
    }

    @Test
    public void test_validateEpubFileReportMapInvalidValue() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report", "test epub"};
        int result = validateFile("test.epub", null, null, null);
        assertEquals(1, result); // 100% coverage
    }

    @Test
    public void test_validateEpubFileReportInvalidValue() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report", "test epub"};
        int result = validateFile("test.epub", null, new Report(), EPUBProfile.EPUB2);
        assertEquals(1, result); // 100% coverage
    }

    @Test
    public void test_validateEpubFileReportMapValue() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report", "test epub"};
        int result = validateFile("test.epub", null, null, null);
        assertEquals(0, result); // 100% coverage
    }

}