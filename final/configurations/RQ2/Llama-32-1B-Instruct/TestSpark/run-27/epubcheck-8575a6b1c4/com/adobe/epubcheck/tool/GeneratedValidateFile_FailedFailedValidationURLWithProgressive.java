package com.adobe.epubcheck.tool;

public class GeneratedValidateFile_FailedFailedValidationURLWithProgressive {

    private static String[] args = new String[0];
    private static Locale locale = null;

    private static int processEpubFile(int argc, String[] argv) { /* implementation */ }

    public static void main(String[] args) throws Exception {
        EpubChecker epc = new EpubChecker();
        epc.run(args);
    }

    @Test
    public void validateFile_FailedFailedValidationURLWithProgressive() {
        File file = new File("test.ebook");
        String failedValidationUrl = "http://example.com/failed-validation-url";
        EpubCheck check = EPUBCheckFactory.createEpubCheck(failedValidationUrl, locale);
        Report report = check.run();
        assertEquals(1, report.getIssues().size());
    }

}