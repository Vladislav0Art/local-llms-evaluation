package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.File;

public class GeneratedTestNoFile {

    @Test
    public void testNoFile() {
        Checker checker = new Checker();
        String expectedOutput = "The following files are not valid EPUBs:\n" +
                "- file1.epub\n" +
                "-";
        assertEquals(expectedOutput, checker.checkFile(""));
    }

}