package com.adobe.epubcheck.tool;

public class GeneratedValidateFile_GeneralFile {

    private static String[] args = new String[0];
    private static Locale locale = null;

    private static int processEpubFile(int argc, String[] argv) { /* implementation */ }

    public static void main(String[] args) throws Exception {
        EpubChecker epc = new EpubChecker();
        epc.run(args);
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

}