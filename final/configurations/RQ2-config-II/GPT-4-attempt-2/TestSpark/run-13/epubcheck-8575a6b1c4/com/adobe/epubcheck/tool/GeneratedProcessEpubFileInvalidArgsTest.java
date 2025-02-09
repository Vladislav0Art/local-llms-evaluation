package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Locale;

public class GeneratedProcessEpubFileInvalidArgsTest {

    @Test
    public void processEpubFileInvalidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] invalidArgs = {"nonexistent.epub"};
        int result = epubChecker.processEpubFile(invalidArgs);
        assertEquals(1, result);
    }

}