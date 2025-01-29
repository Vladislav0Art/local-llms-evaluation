package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestValidateFileMethod {

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

}