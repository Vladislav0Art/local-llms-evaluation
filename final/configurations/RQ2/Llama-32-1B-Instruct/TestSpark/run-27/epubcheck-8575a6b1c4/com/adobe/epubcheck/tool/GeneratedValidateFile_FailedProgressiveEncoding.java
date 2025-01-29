package com.adobe.epubcheck.tool;

public class GeneratedValidateFile_FailedProgressiveEncoding {

    private static String[] args = new String[0];
    private static Locale locale = null;

    private static int processEpubFile(int argc, String[] argv) { /* implementation */ }

    public static void main(String[] args) throws Exception {
        EpubChecker epc = new EpubChecker();
        epc.run(args);
    }

    @Test
    public void validateFile_FailedProgressiveEncoding() {
        File file = new File("test.ebook");
        String progressiveEncodingUrl = URLUtils.getProgressiveEncodingUrl(file);
        EpubCheck check = EPUBCheckFactory.createEpubCheck(progressiveEncodingUrl, locale);
        Report report = check.run();
        assertEquals(1, report.getIssues().size());
    }

}