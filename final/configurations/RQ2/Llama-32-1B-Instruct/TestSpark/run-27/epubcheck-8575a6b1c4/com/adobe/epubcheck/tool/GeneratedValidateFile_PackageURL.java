package com.adobe.epubcheck.tool;

public class GeneratedValidateFile_PackageURL {

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

}