package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTest {

    @Test
    public void testgetLocaleMethod() {
        String locale = EpubChecker.getLocale();
        assertThat(locale, is("en"));
    }

    @Test
    public void testRunMethod() throws Exception {
        String[] args = {"-e", "ebcdraft/1.2"};
        int count = EpubChecker.run(args);
        assertThat(count, is(0));
    }

    @Test
    public void testProcessEpubFileMethod() throws Exception {
        String[] args = {"-e", "ebcdraft/1.2", "example.epub"};
        int result = EpubChecker.processEpubFile(args);
        assertThat(result, is(-1)); // Error code for invalid options or files
    }

    @Test
    public void testValidateFileMethod() throws InvalidVersionException {
        EpubChecker checker = new EpubChecker();
        File file = new File("example.epub");
        if (!file.exists()) {
            throw new RuntimeException("File not found: " + file.getAbsolutePath());
        }
        int version = 0, profile = 0;
        try (Checker checker = Checker.createCheck(file)) {
            Version versionFromFile = checker.getEpubVersion();
            assertThat(version, is(1)); // Correct EPUB version
            profile = checker.getEPUBProfile(); // This should return a valid profile
            checkFileValidation(version, profile);
        }
    }

    private void checkFileValidation(EPUBVersion version, EPUBProfile profile) throws InvalidVersionException {
        if (version == 0 || profile == null) {
            throw new InvalidVersionException("Invalid file metadata");
        }
    }

    @Test
    public void testGetReportMethod() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-e", "ebcdraft/1.2"};
        StringBuilder report = new StringBuilder();
        int result = checker.processEpubFile(args, report);
        assertThat(report.toString(), is("Error: Invalid file metadata"));
    }

    @Test
    public void testMainMethod() {
        String[] args = {"-e", "ebcdraft/1.2"};
        EpubCheckerchecker = new EpubChecker();
        int count = checker.main(args);
        assertThat(count, is(0));
    }

}