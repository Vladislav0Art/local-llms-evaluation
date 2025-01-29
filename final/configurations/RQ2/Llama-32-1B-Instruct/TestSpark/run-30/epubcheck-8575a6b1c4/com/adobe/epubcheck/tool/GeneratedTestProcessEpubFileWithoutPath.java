package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

public class GeneratedTestProcessEpubFileWithoutPath {

    @Test
    public void testProcessEpubFileWithoutPath() {
        String[] args = {"--locale", "en-US"};
        EpubChecker checker = new EpubChecker();
        int result = checker.processEpubFile(args);
        assertEquals(0, result); // ignore invalid path
    }

}