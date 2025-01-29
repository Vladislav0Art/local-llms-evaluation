package com.adobe.epubcheck.tool;

public class GeneratedTest {

    private static String[] args = new String[0];
    private static Locale locale = null;

    private static int processEpubFile(int argc, String[] argv) { /* implementation */ }

    public static void main(String[] args) throws Exception {
        EpubChecker epc = new EpubChecker();
        epc.run(args);
    }

    @Test
    public void validateFile_PackageURL() {
        File file = new File("test.ebook");
        String packageUrl = URLUtils.getPackageUrl(file);
        EpubCheck check = EPUBCheckFactory.createEpubCheck(packageUrl, locale);
        Report report = check.run();
        assertEquals(0, report.getIssues().size());
    }

    @Test
    public void validateFile_ProgressiveEncoding() {
        File file = new File("test.ebook");
        String progressiveEncodingUrl = URLUtils.getProgressiveEncodingUrl(file);
        EpubCheck check = EPUBCheckFactory.createEpubCheck(progressiveEncodingUrl, locale);
        Report report = check.run();
        assertEquals(0, report.getIssues().size());
    }

    @Test
    public void validateFile_GeneralFile() {
        File file = new File("test.ebook");
        EpubChecker epc = new EpubChecker();
        String generalFileUrl = URLUtils GeneralFileUrl(file);
        EpubCheck check = EPUBCheckFactory.createEpubCheck(generalFileUrl, locale);
        Report report = check.run();
        assertEquals(0, report.getIssues().size());
    }

    @Test
    public void validateFile_FailedValidation() {
        File file = new File("test.ebook");
        String failedValidationUrl = URLUtils.getFailedValidationUrl(file);
        EpubCheck check = EPUBCheckFactory.createEpubCheck(failedValidationUrl, locale);
        Report report = check.run();
        assertEquals(1, report.getIssues().size());
    }

    @Test
    public void validateFile_FailedEncoding() {
        File file = new File("test.ebook");
        String failedEncodingUrl = URLUtils.getFailedEncodingUrl(file);
        EpubCheck check = EPUBCheckFactory.createEpubCheck(failedEncodingUrl, locale);
        Report report = check.run();
        assertEquals(1, report.getIssues().size());
    }

    @Test
    public void validateFile_FailedValidationContext() {
        File file = new File("test.ebook");
        String failedValidationContextUrl = URLUtils.getFailedValidationContextUrl(file);
        EpubCheck check = EPUBCheckFactory.createEpubCheck(failedValidationContextUrl, locale);
        Report report = check.run();
        assertEquals(1, report.getIssues().size());
    }

    @Test
    public void validateFile_FailedValidationWithoutEncoding() {
        File file = new File("test.ebook");
        String failedValidationUrl = URLUtils.getFailedValidationUrl(file);
        EpubCheck check = EPUBCheckFactory.createEpubCheck(failedValidationUrl, locale);
        Report report = check.run();
        assertEquals(1, report.getIssues().size());
    }

    @Test
    public void validateFile_FailedEncodingWithoutProgressive() {
        File file = new File("test.ebook");
        String failedEncodingUrl = URLUtils.getFailedEncodingUrl(file);
        EpubCheck check = EPUBCheckFactory.createEpubCheck(failedEncodingUrl, locale);
        Report report = check.run();
        assertEquals(1, report.getIssues().size());
    }

    @Test
    public void validateFile_FailedProgressiveEncoding() {
        File file = new File("test.ebook");
        String progressiveEncodingUrl = URLUtils.getProgressiveEncodingUrl(file);
        EpubCheck check = EPUBCheckFactory.createEpubCheck(progressiveEncodingUrl, locale);
        Report report = check.run();
        assertEquals(1, report.getIssues().size());
    }

    @Test
    public void validateFile_FailedFailedValidation() {
        File file = new File("test.ebook");
        String failedValidationUrl = URLUtils.getFailedValidationUrl(file);
        EpubCheck check = EPUBCheckFactory.createEpubCheck(failedValidationUrl, locale);
        Report report = check.run();
        assertEquals(1, report.getIssues().size());
    }

    @Test
    public void validateFile_FailedFailedEncoding() {
        File file = new File("test.ebook");
        String failedEncodingUrl = URLUtils.getFailedEncodingUrl(file);
        EpubCheck check = EPUBCheckFactory.createEpubCheck(failedEncodingUrl, locale);
        Report report = check.run();
        assertEquals(1, report.getIssues().size());
    }

    @Test
    public void validateFile_FailedValidationWithoutProgressive() {
        File file = new File("test.ebook");
        String failedValidationUrl = URLUtils.getFailedValidationUrl(file);
        EpubCheck check = EPUBCheckFactory.createEpubCheck(failedValidationUrl, locale);
        Report report = check.run();
        assertEquals(1, report.getIssues().size());
    }

    @Test
    public void validateFile_FailedProgressiveWithoutEncoding() {
        File file = new File("test.ebook");
        String progressiveEncodingUrl = URLUtils.getProgressiveEncodingUrl(file);
        EpubCheck check = EPUBCheckFactory.createEpubCheck(progressiveEncodingUrl, locale);
        Report report = check.run();
        assertEquals(1, report.getIssues().size());
    }

    @Test
    public void validateFile_FailedFailedValidationWithoutEncoding() {
        File file = new File("test.ebook");
        String failedValidationUrl = URLUtils.getFailedValidationUrl(file);
        EpubCheck check = EPUBCheckFactory.createEpubCheck(failedValidationUrl, locale);
        Report report = check.run();
        assertEquals(1, report.getIssues().size());
    }

    @Test
    public void validateFile_FailedProgressiveEncodingWithoutURL() {
        File file = new File("test.ebook");
        String progressiveEncodingUrl = "progressive Encoding URL";
        EpubCheck check = EPUBCheckFactory.createEpubCheck(progressiveEncodingUrl, locale);
        Report report = check.run();
        assertEquals(1, report.getIssues().size());
    }

    @Test
    public void validateFile_FailedFailedValidationURL() {
        File file = new File("test.ebook");
        String failedValidationUrl = "http://example.com/failed-validation-url";
        EpubCheck check = EPUBCheckFactory.createEpubCheck(failedValidationUrl, locale);
        Report report = check.run();
        assertEquals(1, report.getIssues().size());
    }

    @Test
    public void validateFile_FailedProgressiveEncodingURL() {
        File file = new File("test.ebook");
        String progressiveEncodingUrl = "progressive Encoding URL";
        EpubCheck check = EPUBCheckFactory.createEpubCheck(progressiveEncodingUrl, locale);
        Report report = check.run();
        assertEquals(1, report.getIssues().size());
    }

    @Test
    public void validateFile_FailedFailedValidationURLWithProgressive() {
        File file = new File("test.ebook");
        String failedValidationUrl = "http://example.com/failed-validation-url";
        EpubCheck check = EPUBCheckFactory.createEpubCheck(failedValidationUrl, locale);
        Report report = check.run();
        assertEquals(1, report.getIssues().size());
    }

    @Test
    public void validateFile_FailedProgressiveEncodingURLWithURL() {
        File file = new File("test.ebook");
        String progressiveEncodingUrl = "progressive Encoding URL";
        EpubCheck check = EPUBCheckFactory.createEpubCheck(progressiveEncodingUrl, locale);
        Report report = check.run();
        assertEquals(1, report.getIssues().size());
    }

    @Test
    public void validateFile_FailedFailedValidationURLWithProgressive() {
        File file = new File("test.ebook");
        String failedValidationUrl = "http://example.com/failed-validation-url";
        EpubCheck check = EPUBCheckFactory.createEpubCheck(failedValidationUrl, locale);
        Report report = check.run();
        assertEquals(1, report.getIssues().size());
    }

    @Test
    public void validateFile_FailedProgressiveEncodingURLWithURL() {
        File file = new File("test.ebook");
        String progressiveEncodingUrl = "progressive Encoding URL";
        EpubCheck check = EPUBCheckFactory.createEpubCheck(progressiveEncodingUrl, locale);
        Report report = check.run();
        assertEquals(1, report.getIssues().size());
    }

}