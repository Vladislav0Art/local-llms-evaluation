package com.adobe.epubcheck.tool;

public class GeneratedTest {

    public static class LocaleHolder {
        public static final Locale locale = Locale.US;
    }

    public static class EpubChecker {
        public static Locale getLocale() {
            return LocaleHolder.locale;
        }
    }
}

public class GeneratedTest {

    @Test
    public void run_validEpubFile_runsSuccessfully() throws Exception {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"test.epub", "--verbose"};
        int result = epubChecker.run(args);
        assertTrue(result == 0);
    }

    @Test
    public void run_invalidEpubFile_returnsError() throws Exception {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"test.epub", "--invalid"};
        int result = epubChecker.run(args);
        assertTrue(result != 0);
    }

}