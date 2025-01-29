package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.File;

public class GeneratedTestFileWithInvalidExtension {

    @Test
    public void testFileWithInvalidExtension() {
        Checker checker = new Checker();
        String expectedOutput = "The following files are not valid EPUBs:\n" +
                "- file1.pdf\n" +
                "- file2.txt";
        assertEquals(expectedOutput, checker.checkFile("file1.pdf"));
        assertEquals(expectedOutput, checker.checkFile("file2.txt"));
    }

}