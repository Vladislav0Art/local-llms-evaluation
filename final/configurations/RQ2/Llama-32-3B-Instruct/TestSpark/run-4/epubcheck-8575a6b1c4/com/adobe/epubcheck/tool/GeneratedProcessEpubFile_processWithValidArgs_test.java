package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Locale;

public class GeneratedProcessEpubFile_processWithValidArgs_test {

    @Test
    public void processEpubFile_processWithValidArgs_test() {
        String[] args = {"--validate", "--profile", "EPUB3"};
        EpubChecker checker = new EpubChecker();
        int result = checker.processEpubFile(args);
        assertTrue(result == 0);
    }

}