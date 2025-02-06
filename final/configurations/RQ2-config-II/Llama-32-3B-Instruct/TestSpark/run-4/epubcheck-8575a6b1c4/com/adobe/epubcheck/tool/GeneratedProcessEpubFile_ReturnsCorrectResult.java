package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.contrib.java.lang.system.SystemPropertyRule;
import com.adobe.epubcheck.tool.EpubChecker;

public class GeneratedProcessEpubFile_ReturnsCorrectResult {

    @Rule
    public final SystemPropertyRule systemProperties = new SystemPropertyRule()
            .set("epub.checker.locale", "en_US");

    @Test
    public void processEpubFile_ReturnsCorrectResult() {
        String[] args = {"path/to/file.epub"};
        EpubChecker checker = new EpubChecker();
        int result = checker.processEpubFile(args);
        assertEquals(1, result);
    }

}