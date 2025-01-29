package com.adobe.epubcheck.tool;

public class GeneratedValidateFile_FailedValidation {

    private static String[] args = new String[0];
    private static Locale locale = null;

    private static int processEpubFile(int argc, String[] argv) { /* implementation */ }

    public static void main(String[] args) throws Exception {
        EpubChecker epc = new EpubChecker();
        epc.run(args);
    }

    @Test
    public void validateFile_FailedValidation() {
        File file = new File("test.ebook");
        String failedValidationUrl = URLUtils.getFailedValidationUrl(file);
        EpubCheck check = EPUBCheckFactory.createEpubCheck(failedValidationUrl, locale);
        Report report = check.run();
        assertEquals(1, report.getIssues().size());
    }

}