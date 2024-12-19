package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import org.junit.jupiter.api.Test;
import com.adobe.epubcheck.tool.EpubVersion;

import java.io.File;

public class GeneratedValidateFileTest {

    @Test
    public void validateFileTest() {
        String path = "path/to/file.epub";
        if (EpubChecker.isEPUBVersion(1_2)) {
            EPUBVersion version = EpubVersion .1_2;
        } else {
            throw new UnsupportedOperationException("Unsupported EPUB version: " + EpubVersion.getVersion(version));
        }
        Report report = new Report();
        EpubChecker checker = new EpubChecker();
        int result = checker.validateFile(path, version, report, null);
        assertTrue(result == 0);
    }

}