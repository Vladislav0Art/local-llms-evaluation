package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

public class GeneratedTestProcessEpubFile {

    @Test
    public void testProcessEpubFile() {
        String[] args = {"--test", "test.ebook"};
        EpubChecker checker = new EpubChecker();
        int result = checker.processEpubFile(args);
        assertEquals(0, result); // ignore invalid version
    }

}