package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.File;

public class GeneratedTestValidVersion {

    @Test
    public void testValidVersion() {
        Checker checker = new Checker();
        String expectedOutput = "The following files are valid EPUBs:\n" +
                "- file1.epub\n" +
                "- file2.epub";
        assertEquals(expectedOutput, checker.checkVersion("4.2"));
    }

}