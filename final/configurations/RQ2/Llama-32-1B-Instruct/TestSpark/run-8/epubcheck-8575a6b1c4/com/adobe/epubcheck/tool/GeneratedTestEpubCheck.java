package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.File;

public class GeneratedTestEpubCheck {

    @Test
    public void testEpubCheck() {
        Checker checker = new Checker();
        String expectedOutput = "The following files are not valid EPUBs:\n" +
                "- file1.epub\n" +
                "- file2.epub";
        assertEquals(expectedOutput, checker.checkFile("file1.epub"));
        assertEquals(expectedOutput, checker.checkFile("file2.epub"));
    }

}