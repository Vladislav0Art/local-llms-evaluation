package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testProcessEpubFile() {
        String[] args = {"--test", "test.ebook"};
        EpubChecker checker = new EpubChecker();
        int result = checker.processEpubFile(args);
        assertEquals(0, result); // ignore invalid version
    }

    @Test
    public void testProcessEpubFileWithoutPath() {
        String[] args = {"--locale", "en-US"};
        EpubChecker checker = new EpubChecker();
        int result = checker.processEpubFile(args);
        assertEquals(0, result); // ignore invalid path
    }

    @Test
    public void testProcessEpubFileWithInvalidPath() {
        String[] args = {"--locale", "en-US", "/invalid/path"};
        EpubChecker checker = new EpubChecker();
        int result = checker.processEpubFile(args);
        assertEquals(1, result); // ignore invalid path
    }

    @Test
    public void testProcessEpubFileWithInvalidPath() {
        String[] args = {"--locale", "en-US"};
        EpubChecker checker = new EpubChecker();
        int result = checker.processEpubFile(args);
        assertEquals(1, result); // ignore invalid path
    }

}