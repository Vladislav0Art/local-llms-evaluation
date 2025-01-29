package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

public class GeneratedTestProcessEpubFileWithInvalidPath {

    @Test
    public void testProcessEpubFileWithInvalidPath() {
        String[] args = {"--locale", "en-US"};
        EpubChecker checker = new EpubChecker();
        int result = checker.processEpubFile(args);
        assertEquals(1, result); // ignore invalid path
    }

}