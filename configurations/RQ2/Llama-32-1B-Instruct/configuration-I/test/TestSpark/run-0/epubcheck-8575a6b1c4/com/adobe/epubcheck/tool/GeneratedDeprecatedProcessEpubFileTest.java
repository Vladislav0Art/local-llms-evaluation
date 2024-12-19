package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import org.junit.jupiter.api.Test;
import com.adobe.epubcheck.tool.EpubVersion;

import java.io.File;

public class GeneratedDeprecatedProcessEpubFileTest {

    @Test
    public void deprecatedProcessEpubFileTest() {
        String[] args = {"--test", "-e"};
        File file = new File("path/to/test.epub");
        EpubChecker checker = new EpubChecker();
        int result = checker.processEpubFile(args);
        assertTrue(result == 0);
    }

}