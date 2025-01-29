package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.File;

public class GeneratedTestFileWithoutExtension {

    @Test
    public void testFileWithoutExtension() {
        Checker checker = new Checker();
        String expectedOutput = "The following files are not valid EPUBs:\n" +
                "- file1\n" +
                "- file2";
        assertEquals(expectedOutput, checker.checkFile("file1"));
        assertEquals(expectedOutput, checker.checkFile("file2"));
    }

}