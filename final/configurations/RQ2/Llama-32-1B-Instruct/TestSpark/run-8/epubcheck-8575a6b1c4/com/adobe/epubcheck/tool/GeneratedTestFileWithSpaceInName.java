package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.File;

public class GeneratedTestFileWithSpaceInName {

    @Test
    public void testFileWithSpaceInName() {
        Checker checker = new Checker();
        String expectedOutput = "The following files are not valid EPUBs:\n" +
                "- file with space in name.epub\n" +
                "- file2.epub";
        assertEquals(expectedOutput, checker.checkFile("file with space in name.epub"));
        assertEquals(expectedOutput, checker.checkFile("file2.epub"));
    }

}