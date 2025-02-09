package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Locale;

public class GeneratedProcessEpubFileValidArgsTest {

    @Test
    public void processEpubFileValidArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] validArgs = {"testFile.epub"};
        int result = epubChecker.processEpubFile(validArgs);
        assertEquals(0, result);
    }

}