package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.File;

public class GeneratedTestValidEpub {

    @Test
    public void testValidEpub() {
        Checker checker = new Checker();
        String expectedOutput = "The following files are valid EPUBs:\n" +
                "- file4.epub\n" +
                "- file5.epub";
        assertEquals(expectedOutput, checker.checkFile("file4.epub"));
        assertEquals(expectedOutput, checker.checkFile("file5.epub"));
    }

}