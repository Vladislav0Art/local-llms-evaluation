package com.adobe.epubcheck.tool;

public class GeneratedTest {

    public static int run(String[] args) {
        // implementation
        return 0;
    }

    public static int validate(String epubFile, String epbVersion, Report report, EPUBProfile profile) {
        // implementation
        return 1;
    }

    public static Locale locale() {
        return Locale.getDefault();
    }
}

public class TestEpubChecker {

    @Test
    public void run_ValidatesEpubFileAndReturnsSuccess() throws Exception {
        String[] args = {"-v", "1.0"};
        EpubChecker checker = new EpubChecker();
        int result = checker.run(args);
        assertTrue(result == 0);
    }

    @Test
    public void run_InvalidatesEpubFileWithNonZeroExitCode() throws Exception {
        String[] args = {"-v", "1.0"};
        EpubChecker checker = new EpubChecker();
        int result = checker.run(args);
        assertFalse(result == 0);
    }

}